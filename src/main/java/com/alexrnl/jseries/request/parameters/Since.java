package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which allow to set a timestamp from which to look-up series.<br />
 * @author Alex
 */
public class Since extends Parameter<Integer> {
	/** The name of the since parameter */
	public static final String	PARAMETER_SINCE	= "since";
	
	/**
	 * Constructor #1.<br />
	 * @param since
	 *        the timestamp (in seconds)
	 */
	public Since (final Integer since) {
		super(PARAMETER_SINCE, since);
	}
}
