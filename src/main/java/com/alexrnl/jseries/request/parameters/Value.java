package com.alexrnl.jseries.request.parameters;

/**
 * Parameter to set the value of the option.<br />
 * @author Alex
 */
public class Value extends Parameter<String> {
	/** Name of the value parameter */
	public static final String	PARAMETER_VALUE	= "name";
	
	/**
	 * Constructor #1.<br />
	 * @param value
	 *        the value to set.
	 */
	public Value (final String value) {
		super(PARAMETER_VALUE, value);
	}
}
