package com.alexrnl.jseries.request.parameters;


/**
 * Parameter indicating to use the new version of the BetaSeries API.<br />
 * @author Alex
 */
public class Version extends Parameter<String> {
	/** Name of the beta parameter */
	private static final String	PARAMETER_BETA	= "v";
	/** Version of the API to use TODO parametrize */
	private static final String	BETA_VERSION	= "2.1";
	
	/**
	 * Constructor #1.<br />
	 */
	public Version () {
		super(PARAMETER_BETA, BETA_VERSION);
	}
}
