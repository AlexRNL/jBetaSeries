package com.alexrnl.jseries;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;

import com.alexrnl.commons.error.ExceptionUtils;
import com.alexrnl.jseries.request.members.MemberAuth;
import com.alexrnl.jseries.request.shows.ShowDisplay;
import com.alexrnl.jseries.services.Format;
import com.alexrnl.jseries.services.RequestManager;

/**
 * Entry point of the interface to the BetaSeries API.<br />
 * @author Alex
 */
public final class JSeries {
	/** Logger */
	private static final Logger		LG	= Logger.getLogger(JSeries.class.getName());
	
	/** The request manager */
	private final RequestManager	requestManager;
	
	/**
	 * Constructor #1.<br />
	 * This will use the {@link Format#XML XML} format of the API.
	 * @param key
	 *        the API key to use.
	 */
	public JSeries (final String key) {
		this(key, Format.XML);
	}
	
	/**
	 * Constructor #2.<br />
	 * @param key
	 *        the API key to use.
	 * @param format
	 *        the data type required for the API.
	 */
	public JSeries (final String key, final Format format) {
		this(key, format, JSeries.class.getSimpleName());
	}
	
	/**
	 * Constructor #2.<br />
	 * This constructor will use the default JVM charset (probably UTF-8).
	 * @param key
	 *        the API key to use.
	 * @param format
	 *        the data type required for the API.
	 * @param userAgent
	 *        the user-agent to use with the application.
	 */
	public JSeries (final String key, final Format format, final String userAgent) {
		this(key, format, userAgent, Charset.defaultCharset());
	}
	
	/**
	 * Constructor #2.<br />
	 * @param key
	 *        the API key to use.
	 * @param format
	 *        the data type required for the API.
	 * @param userAgent
	 *        the user-agent to use with the application.
	 * @param charset
	 *        the charset to use.
	 */
	public JSeries (final String key, final Format format, final String userAgent, final Charset charset) {
		super();
		this.requestManager = new RequestManager(key, format, userAgent, charset, false);
	}
	
	/**
	 * Entry point of test method.<br />
	 * @param args
	 *        the arguments from the command line.
	 */
	public static void main (final String[] args) {
		final JSeries jSeries = new JSeries("", Format.XML);
		
		try {
			LG.info(jSeries.requestManager.execute(new MemberAuth("", "")));
//			jSeries.requestManager.setToken("");
			LG.info(jSeries.requestManager.execute(new ShowDisplay(8, 1)));
//			LG.info(jSeries.requestManager.execute(new MemberDestroy()));
		} catch (final IOException e) {
			LG.warning("Error while processing request: " + ExceptionUtils.display(e));
		}
	}
	
}
