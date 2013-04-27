package com.alexrnl.jbetaseries;

import java.util.logging.Logger;

/**
 * Entry point of the interface to the BetaSeries API.<br />
 * @author Alex
 */
public final class JBetaSeries {
	/** Logger */
	private static Logger	lg	= Logger.getLogger(JBetaSeries.class.getName());
	
	/** The key to use for the API */
	private final String	key;
	/** The preferred data type format */
	private final Format	format;
	/** The token for the user, <code>null</code> if no user is logged. */
	private final String	token;
	
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
		super();
		this.key = key;
		this.format = format;
		this.token = null;
	}
	
}
