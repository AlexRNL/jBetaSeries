package com.alexrnl.jbetaseries.request;

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
import com.alexrnl.jbetaseries.request.parameters.Parameter;

/**
 * Handle the request to the API.<br />
 * @author Alex
 */
public class RequestManager {
	/** Logger */
	private static Logger	lg	= Logger.getLogger(RequestManager.class.getName());
	
	/** The key of the API */
	private final String	key;
	/** The format of the API response required */
	private final Format	format;
	/** The user-agent of the application */
	private final String	userAgent;
	/** The charset to use */
	private final Charset	charset;
	/** The token for the user, <code>null</code> if no user is logged. */
	private String			token;
	/** <code>true</code> if using the secure API address */
	private final boolean	isSecure;
	
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
		this(key, format, userAgent, charset, false);
	}

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
		
		if (lg.isLoggable(Level.FINE)) {
			lg.fine(RequestManager.class.getSimpleName() + " created: " + toString());
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
			if (lg.isLoggable(Level.INFO)) {
				lg.info("Connecting to " + address.toString());
			}
			connection = (HttpURLConnection) new URL(address.toString()).openConnection();
		} catch (final MalformedURLException e) {
			lg.warning("Could not build URL: " + ExceptionUtils.display(e));
			throw new IOException("Could not build address from " + address.toString(), e);
		}
		
		// Set connection properties
		connection.setDoOutput(true);
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
			connection.setDoInput(true);
			connection.setRequestProperty("Content-Length", "" + Integer.toString(parameterBytes.length));
			connection.setUseCaches(false);
			if (lg.isLoggable(Level.INFO)) {
				lg.info("Sending parameters: " + parameters);
			}

			connection.connect();
			final OutputStream wr = connection.getOutputStream();
			wr.write(parameterBytes);
			wr.flush();
			wr.close();
		} else {
			connection.setDoInput(false);
			connection.connect();
		}
		
		lg.info("Response code: " + connection.getResponseCode() +
				"; message: " + connection.getResponseMessage());

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
			lg.warning("Error while reading data from API: " + ExceptionUtils.display(e));
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
		if (parameters.size() == 0) {
			return "";
		}
		final StringBuilder parametersBuilder = new StringBuilder();
		for (final Parameter<?> parameter : parameters) {
			parametersBuilder.append(parameter.getName()).append('=')
			.append(URLEncoder.encode(String.valueOf(parameter.getValue()), charset.name()))
			.append('&');
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
