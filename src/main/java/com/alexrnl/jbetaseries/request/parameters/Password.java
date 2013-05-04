package com.alexrnl.jbetaseries.request.parameters;


/**
 * Parameter which allow to set the password (MD5 encoded) of the application.
 * @author Alex
 */
public class Password extends Parameter<String> {
	/** Name of the password parameter */
	public static final String	PARAMETER_PASSWORD	= "password";
	
	/**
	 * Constructor #1.<br />
	 * @param password
	 *        the password of the account.
	 */
	public Password (final String password) {
		super(PARAMETER_PASSWORD, password);
	}
}
