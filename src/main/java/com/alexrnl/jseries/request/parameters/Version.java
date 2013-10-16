package com.alexrnl.jseries.request.parameters;


/**
 * Parameter indicating to use the new version of the BetaSeries API.<br />
 * @author Alex
 */
public class BetaVersion extends Parameter<String> {
	/** Name of the beta parameter */
	private static final String	PARAMETER_BETA	= "v";
	/** Version of the API to use */
	private static final String	BETA_VERSION	= "2.0";
	
	/**
	 * Constructor #1.<br />
	 */
	public BetaVersion () {
		super(PARAMETER_BETA, BETA_VERSION);
	}
}
