package com.alexrnl.jseries.services;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Default implementation of the {@link HttpConnectionProvider} interface.<br />
 * @author Alex
 */
public class DefaultHttpConnectionProvider implements HttpConnectionProvider {
	@Override
	public HttpURLConnection getHttpConnection (final String address) throws IOException {
		try {
			return (HttpURLConnection) new URL(address).openConnection();
		} catch (final MalformedURLException e) {
			throw new IllegalArgumentException("Address '" + address + "' cannot be parsed as valid URL", e);
		}
	}
}
