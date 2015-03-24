package com.alexrnl.jseries.services;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

/**
 * Interface for a provider that builds {@link HttpURLConnection} from addresses.
 * @author Alex
 */
public interface HttpConnectionProvider {
	
	/**
	 * Create an HTTP connection to the specified address.
	 * @param address
	 *        the address to connect to.
	 * @return the HTTP connection to the provided address.
	 * @throws MalformedURLException
	 *         if the address is not correct.
	 * @throws IOException
	 *         if there is an I/O error during the operation.
	 */
	HttpURLConnection getHttpConnection (String address) throws MalformedURLException, IOException ;
	
}
