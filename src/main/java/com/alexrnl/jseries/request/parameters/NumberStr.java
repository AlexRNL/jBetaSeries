package com.alexrnl.jseries.request.parameters;


/**
 * Parameter which allow to set the number of the episode to get.<br />
 * @author Alex
 */
public class NumberStr extends Parameter<String> {
	/** The name of the number parameter */
	public static final String PARAMETER_NUMBER_STR = "number";
	
	/**
	 * Constructor #1.<br />
	 * @param number
	 *        the number of the episode.
	 */
	public NumberStr (final String number) {
		super(PARAMETER_NUMBER_STR, number);
	}
}
