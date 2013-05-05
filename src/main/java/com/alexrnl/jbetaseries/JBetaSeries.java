package com.alexrnl.jbetaseries;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;

import com.alexrnl.commons.error.ExceptionUtils;
import com.alexrnl.jbetaseries.request.Format;
import com.alexrnl.jbetaseries.request.RequestManager;
import com.alexrnl.jbetaseries.request.members.MemberAuth;
import com.alexrnl.jbetaseries.request.members.MemberDestroy;
import com.alexrnl.jbetaseries.request.members.MemberOptions;

/**
 * Entry point of the interface to the BetaSeries API.<br />
 * @author Alex
 */
public final class JBetaSeries {
	/** Logger */
	private static Logger			lg	= Logger.getLogger(JBetaSeries.class.getName());
	
	/** The request manager */
	private final RequestManager	requestManager;
	
	/**
	 * Constructor #1.<br />
	 * This will use the {@link Format#XML XML} format of the API.
	 * @param key
	 *        the API key to use.
	 */
	public JBetaSeries (final String key) {
		this(key, Format.XML);
	}
	
	/**
	 * Constructor #2.<br />
	 * @param key
	 *        the API key to use.
	 * @param format
	 *        the data type required for the API.
	 */
	public JBetaSeries (final String key, final Format format) {
		this(key, format, JBetaSeries.class.getSimpleName());
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
	public JBetaSeries (final String key, final Format format, final String userAgent) {
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
	public JBetaSeries (final String key, final Format format, final String userAgent, final Charset charset) {
		super();
		this.requestManager = new RequestManager(key, format, userAgent, charset);
	}
	
	/**
	 * Entry point of test method.<br />
	 * @param args
	 *        the arguments from the command line.
	 */
	public static void main (final String[] args) {
		final JBetaSeries jBetaSeries = new JBetaSeries("", Format.XML);
		
		try {
			lg.info(jBetaSeries.requestManager.execute(new MemberAuth("", "")));
			jBetaSeries.requestManager.setToken(null);
			lg.info(jBetaSeries.requestManager.execute(new MemberOptions()));
			jBetaSeries.requestManager.equals(new MemberDestroy());
		} catch (final IOException e) {
			lg.warning("Error while processing request: " + ExceptionUtils.display(e));
		}
	}
	
}
