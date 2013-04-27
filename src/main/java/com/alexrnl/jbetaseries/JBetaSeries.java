package com.alexrnl.jbetaseries;

import java.util.logging.Logger;

/**
 * Entry point of the interface to the BetaSeries API.<br />
 * @author Alex
 */
public class JBetaSeries {
	/** Logger */
	private static Logger	lg	= Logger.getLogger(JBetaSeries.class.getName());
	
	/** The key to use for the API */
	private String key;
	/** The preferred data type format */
	private Format preferredFormat;
	/** The token for the user */
	private String token;
}
