package com.alexrnl.jbetaseries.request.parameters;

/**
 * Parameter which allow to set the login of the member.<br />
 * @author Alex
 */
public class Login extends Parameter<String> {
	/** Name for the login parameter */
	public static final String	PARAMETER_LOGIN	= "login";
	
	/**
	 * Constructor #.<br />
	 * @param login
	 *        the login of the member.
	 */
	public Login (final String login) {
		super(PARAMETER_LOGIN, login);
	}
}
