package com.alexrnl.jseries.request.parameters;

/**
 * Parameter indicating to use the new version of the BetaSeries API.<br />
 * @author Alex
 */
public class Version extends Parameter<String> {
	/** Name of the beta parameter */
	private static final String	PARAMETER_VERSION	= "v";
	/** Version of the API to use TODO parametrize */
	private static final String	VERSION_NUMBER		= "2.1";
	
	/**
	 * Constructor #1.<br />
	 */
	public Version () {
		super(PARAMETER_VERSION, VERSION_NUMBER);
	}
}
