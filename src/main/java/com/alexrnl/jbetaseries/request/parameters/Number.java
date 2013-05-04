package com.alexrnl.jbetaseries.request.parameters;


/**
 * Parameter which allow to set the number of items to retrieve.<br />
 * @author Alex
 */
public class Number extends Parameter<Integer> {
	/** The name of the number parameter */
	public static final String PARAMETER_NUMBER = "number";
	
	/**
	 * Constructor #1.<br />
	 * @param number
	 *        the number of items to set.
	 */
	public Number (final Integer number) {
		super(PARAMETER_NUMBER, number);
	}
}
