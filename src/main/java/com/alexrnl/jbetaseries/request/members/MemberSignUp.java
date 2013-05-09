package com.alexrnl.jbetaseries.request.members;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.EMail;
import com.alexrnl.jbetaseries.request.parameters.Login;
import com.alexrnl.jbetaseries.request.parameters.Password;

/**
 * Request for signing-up for a user.<br />
 * @author Alex
 */
public class MemberSignUp extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param login
	 *        the login of the user.
	 * @param password
	 *        the password of the user.
	 * @param email
	 *        the email of the user.
	 */
	public MemberSignUp (final String login, final String password, final String email) {
		super(Verb.POST, APIAddresses.MEMBERS_SIGN_UP);
		addParameter(new Login(login));
		addParameter(new Password(password));
		addParameter(new EMail(email));
	}
}
