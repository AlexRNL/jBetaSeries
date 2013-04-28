package com.alexrnl.jbetaseries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.logging.Logger;


/**
 * PoC for the new BetaSeries API.
 * @author Alex
 * @version 11.0, 26 avr. 2013
 * @since 26 avr. 2013
 */
public class BSTestAPI {
	/** Logger */
	private static Logger		lg				= Logger.getLogger(BSTestAPI.class.getName());
	
	/** The API key */
	private static final String	KEY				= "4B4B65A6071D";
	/** The default time out */
	private static final int	DEFAULT_TIMEOUT	= 3000;
	
	/** The show search method address */
	private final String		showSearchAddress;
	/** The show display method address */
	private final String		showDisplayAddress;
	
	/**
	 * Constructor #1.<br />
	 */
	public BSTestAPI () {
		super();
		showSearchAddress = "http://api.betaseries.com/shows/search";
		showDisplayAddress = "http://api.betaseries.com/shows/display";
	}
	
	/**
	 * Search for a show from a string.
	 * @param showName
	 *        the name of the show.
	 * @throws IOException
	 *         if there was a communication error.
	 * @throws URISyntaxException
	 *         if there is an error in the link syntax
	 */
	private void showSearch (final String showName) throws IOException, URISyntaxException {
		final HttpURLConnection connection = (HttpURLConnection) new URI(showSearchAddress + "?title=" +
				URLEncoder.encode(showName, "utf-8") + "&v=2.0").toURL().openConnection();
		connection.setRequestMethod("GET");
		connection.addRequestProperty("Accept-Charset", Charset.defaultCharset().name());
		connection.addRequestProperty("X-BetaSeries-Key", KEY);
		connection.addRequestProperty("User-Agent", "BSTestApi - Java ");
		connection.addRequestProperty("Accept", "text/xml");
		
		connection.setReadTimeout(DEFAULT_TIMEOUT);
		connection.connect();
		
		lg.info("Response code: " + connection.getResponseCode());
		
		final BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		final StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line + '\n');
		}
		rd.close();
		
		lg.info(sb.toString());
	}
	
	private void showDisplay (final int id) throws MalformedURLException, IOException, URISyntaxException {
		final HttpURLConnection connection = (HttpURLConnection) new URI(showDisplayAddress + "?id=" +
				Integer.toString(id) + "&v=2.0").toURL().openConnection();
		connection.setRequestMethod("GET");
		connection.addRequestProperty("Accept-Charset", Charset.defaultCharset().name());
		connection.addRequestProperty("X-BetaSeries-Key", KEY);
		connection.addRequestProperty("User-Agent", "BSTestApi - Java ");
		connection.addRequestProperty("Accept", "text/xml");
		
		connection.setReadTimeout(3000);
		connection.connect();
		
		lg.info("Response code: " + connection.getResponseCode());
		
		final BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		final StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line + '\n');
		}
		
		lg.info(sb.toString());
	}
	
	/**
	 * Entry point.
	 * @param args
	 *        the arguments from the command line.
	 * @throws IOException
	 *         if an IO error occurred while loading data.
	 * @throws URISyntaxException
	 *         if there is an error in the link syntax.
	 */
	public static void main (final String[] args) throws IOException, URISyntaxException {
		final BSTestAPI api = new BSTestAPI();
		api.showSearch("person of");
		api.showDisplay(8);
	}
	
}