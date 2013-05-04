package com.alexrnl.jbetaseries.request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.alexrnl.commons.error.ExceptionUtils;

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
	// TODO add the secure flag
	
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
	public RequestManager (final String key, final Format format, final String userAgent, final Charset charset) {
		super();
		this.key = key;
		this.format = format;
		this.userAgent = userAgent;
		this.charset = charset;
		this.token = null;
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
		try {
			connection = (HttpURLConnection) new URI(buildAddress(request)).toURL().openConnection();
		} catch (final URISyntaxException | UnsupportedEncodingException e) {
			lg.warning("Could not build URI: " + ExceptionUtils.display(e));
			return "failed!";
		}
		
		connection.setRequestMethod(request.getVerb().getHttpMethodName());
		//connection.addRequestProperty("Accept-Charset", charset.name());
		connection.addRequestProperty(APIConstants.KEY_PARAMETER, key);
		connection.addRequestProperty("User-Agent", userAgent);
		connection.addRequestProperty("Accept", format.getDescription());
		if (token != null) {
			connection.addRequestProperty(APIConstants.TOKEN_PARAMETER, token);
		}
		
		final StringBuilder sb = new StringBuilder();
		connection.connect();
		lg.info("Response code: " + connection.getResponseCode() +
				"; message: " + connection.getResponseMessage());
		
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
	 * Build the address to connect to from the specified request.<br />
	 * @param request
	 *        the request to use to build the address.
	 * @return the address to connect to.
	 * @throws UnsupportedEncodingException
	 *         if the selected encoding is not supported by the platform.
	 */
	private String buildAddress (final Request request) throws UnsupportedEncodingException {
		String address;
		final StringBuilder addressBuilder = new StringBuilder(APIAddresses.HTTP).append(APIAddresses.HOST);
		addressBuilder.append(request.getMethod());
		
		if (!request.getParameters().isEmpty()) {
			addressBuilder.append("?");
			for (final Entry<String, String> parameter : request.getParameters().entrySet()) {
				addressBuilder.append(parameter.getKey()).append("=")
				.append(URLEncoder.encode(parameter.getValue(), charset.name()))
				.append("&");
			}
			// Remove the last ampersand
			address = addressBuilder.substring(0, addressBuilder.length() - 1).trim();
		} else {
			address = addressBuilder.toString().trim();
		}
		
		if (lg.isLoggable(Level.INFO)) {
			lg.info("created address: " + address);
		}
		return address;
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
}
