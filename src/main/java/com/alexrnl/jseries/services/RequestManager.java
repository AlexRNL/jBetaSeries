package com.alexrnl.jseries.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.alexrnl.commons.error.ExceptionUtils;
import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.APIConstants;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Parameter;

/**
 * Handle the request to the API.<br />
 * @author Alex
 */
public class RequestManager {
	/** Logger */
	private static final Logger	LG	= Logger.getLogger(RequestManager.class.getName());
	
	/** The key of the API */
	private final String		key;
	/** The format of the API response required */
	private final Format		format;
	/** The user-agent of the application */
	private final String		userAgent;
	/** The charset to use */
	private final Charset		charset;
	/** The token for the user, <code>null</code> if no user is logged. */
	private String				token;
	/** <code>true</code> if using the secure API address */
	private final boolean		isSecure;
	
	/**
	 * Constructor #1.<br />
	 * @param key
	 *        the key of the API.
	 * @param format
	 *        the format for the API response.
	 * @param userAgent
	 *        the user-agent to declare.
	 * @param charset
	 *        the charset to use.
	 */
	public RequestManager (final String key, final Format format, final String userAgent,
			final Charset charset) {
		this(key, format, userAgent, charset, true);
	}

	/**
	 * Constructor #2.<br />
	 * @param key
	 *        the key of the API.
	 * @param format
	 *        the format for the API response.
	 * @param userAgent
	 *        the user-agent to declare.
	 * @param charset
	 *        the charset to use.
	 * @param isSecure
	 *        <code>true</code> for using the secure API address.
	 */
	public RequestManager (final String key, final Format format, final String userAgent,
			final Charset charset, final boolean isSecure) {
		super();
		this.key = key;
		this.format = format;
		this.userAgent = userAgent;
		this.charset = charset;
		this.isSecure = isSecure;
		this.token = null;
		
		if (LG.isLoggable(Level.FINE)) {
			LG.fine(RequestManager.class.getSimpleName() + " created: " + toString());
		}
	}
	
	/**
	 * Execute the specified request.<br />
	 * @param request
	 *        the request to execute.
	 * @return the result of the request.
	 * @throws IOException
	 *         if there was an error while sending the request to the API.
	 */
	public String execute (final Request request) throws IOException {
		HttpURLConnection connection;
		// Build address
		final StringBuilder address = new StringBuilder(buildAddress(request));
		final String parameters = getParameters(request);
		if (!isPost(request)) {
			address.append('?').append(parameters);
		}
		
		// Open connection to address
		try {
			if (LG.isLoggable(Level.INFO)) {
				LG.info("Connecting to " + address.toString());
			}
			connection = (HttpURLConnection) new URL(address.toString()).openConnection();
		} catch (final MalformedURLException e) {
			LG.warning("Could not build URL: " + ExceptionUtils.display(e));
			throw new IOException("Could not build address from " + address.toString(), e);
		}
		
		// Set connection properties
		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.setRequestMethod(request.getVerb().getHttpMethodName());
		connection.addRequestProperty("Accept-Charset", charset.name());
		connection.addRequestProperty("User-Agent", userAgent);
		connection.addRequestProperty("Accept", format.getDescription());
		connection.addRequestProperty(APIConstants.KEY_PARAMETER, key);
		if (token != null) {
			connection.addRequestProperty(APIConstants.TOKEN_PARAMETER, token);
		}
		
		// Writing parameter for post request
		if (isPost(request)) {
			final byte[] parameterBytes = parameters.getBytes(charset);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestProperty("Content-Length", "" + Integer.toString(parameterBytes.length));
			if (LG.isLoggable(Level.INFO)) {
				LG.info("Sending parameters: " + parameters);
			}

			connection.connect();
			final OutputStream wr = connection.getOutputStream();
			wr.write(parameterBytes);
			wr.flush();
			wr.close();
		} else {
			connection.connect();
		}
		
		if (LG.isLoggable(Level.INFO)) {
			LG.info("Response code: " + connection.getResponseCode() +
					"; message: " + connection.getResponseMessage());
		}

		final StringBuilder sb = new StringBuilder();
		final InputStream stream = connection.getResponseCode() == HttpURLConnection.HTTP_OK ?
				connection.getInputStream() : connection.getErrorStream();
		try (final BufferedReader rd = new BufferedReader(new InputStreamReader(stream,
				charset.name()))) {
			String line;
			while ((line = rd.readLine()) != null) {
				sb.append(line + '\n');
			}
		} catch (final IOException e) {
			LG.warning("Error while reading data from API: " + ExceptionUtils.display(e));
		}
		return sb.toString();
	}
	
	/**
	 * Check is a request is a {@link Verb#POST} request.<br />
	 * @param request
	 *        the request to test.
	 * @return <code>true</code> if it is a POST request.
	 */
	private static boolean isPost (final Request request) {
		return Verb.POST.equals(request.getVerb());
	}
	
	/**
	 * Build the address to connect to from the specified request.<br />
	 * @param request
	 *        the request to use to build the address.
	 * @return the address to connect to.
	 */
	private String buildAddress (final Request request) {
		return (isSecure ? APIAddresses.HTTPS : APIAddresses.HTTP) + APIAddresses.HOST + request.getMethod();
	}
	
	/**
	 * Build the string from the parameters of the request.<br />
	 * @param request
	 *        the request to use to build the address.
	 * @return the parameters to sent to the API.
	 * @throws UnsupportedEncodingException
	 *         if the selected encoding is not supported by the platform.
	 */
	private String getParameters (final Request request) throws UnsupportedEncodingException {
		final List<Parameter<?>> parameters = request.getParameters();
		if (parameters.isEmpty()) {
			return "";
		}
		final StringBuilder parametersBuilder = new StringBuilder();
		for (final Parameter<?> parameter : parameters) {
			parametersBuilder.append(parameter.getName());
			// Check against null parameters, if a parameter is null, then its name is enough
			if (parameter.getValue() != null) {
				parametersBuilder.append('=')
				.append(URLEncoder.encode(String.valueOf(parameter.getValue()), charset.name()));
			}
			parametersBuilder.append('&');
		}
		// Remove the last ampersand
		return parametersBuilder.substring(0, parametersBuilder.length() - 1).trim();
	}
	
	/**
	 * Return the attribute token.
	 * @return the attribute token.
	 */
	public String getToken () {
		return token;
	}
	
	/**
	 * Set the attribute token.
	 * @param token the attribute token.
	 */
	public void setToken (final String token) {
		this.token = token;
	}

	/**
	 * Return the attribute isSecure.
	 * @return the attribute isSecure.
	 */
	public boolean isSecure () {
		return isSecure;
	}

	@Override
	public String toString () {
		return "RequestManager [key=" + key + ", format=" + format + ", userAgent=" + userAgent
				+ ", charset=" + charset + ", token=" + token + ", isSecure=" + isSecure + "]";
	}
	
}
