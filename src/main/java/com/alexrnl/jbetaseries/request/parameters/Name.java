package com.alexrnl.jbetaseries.request.parameters;

/**
 * Parameter for the option name.<br />
 * @author Alex
 */
public class Name extends Parameter<String> {
	/** Name of the name parameter */
	public static final String	PARAMETER_NAME	= "name";
	
	/**
	 * Constructor #1.<br />
	 * @param name
	 *        the name to set.
	 */
	public Name (final String name) {
		super(PARAMETER_NAME, name);
	}
}
