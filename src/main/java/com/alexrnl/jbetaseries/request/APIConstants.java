package com.alexrnl.jbetaseries.request;

/**
 * Class defining the constants used by the API.<br />
 * @author Alex
 */
public final class APIConstants {
	
	/**
	 * Constructor #1.<br />
	 * Default private constructor.
	 */
	private APIConstants () {
		super();
	}
	
	/** Flag indicating the status of the API */
	public static final boolean	IS_BETA			= true;
	/** The name for the API key parameter */
	public static final String	KEY_PARAMETER	= "X-BetaSeries-Key";
	/** The name for the API token parameter */
	public static final String	TOKEN_PARAMETER	= "X-BetaSeries-Token";
}
