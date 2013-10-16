package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which allow to set the email.<br />
 * @author Alex
 */
public class EMail extends Parameter<String> {
	/** The name of the email parameter */
	public static final String	PARAMETER_EMAIL	= "email";
	
	/**
	 * Constructor #1.<br />
	 * @param email
	 *        the email of the member.
	 */
	public EMail (final String email) {
		super(PARAMETER_EMAIL, email);
	}
	
}
