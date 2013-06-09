package com.alexrnl.jbetaseries.request.parameters;


/**
 * Parameter which allow to set an email for the member to be find.<br />
 * @author Alex
 */
public class Find extends Parameter<String> {
	/** The name of the email parameter */
	public static final String	PARAMETER_FIND = "find";
	
	/**
	 * Constructor #1.<br />
	 * @param email
	 *        the email of the member to find.
	 */
	public Find (final String email) {
		super(PARAMETER_FIND, email);
	}
}
