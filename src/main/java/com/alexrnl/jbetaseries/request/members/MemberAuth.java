package com.alexrnl.jbetaseries.request.members;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Login;
import com.alexrnl.jbetaseries.request.parameters.Password;

/**
 * Authenticate a member.<br />
 * @author Alex
 */
public class MemberAuth extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param login
	 *        the login of the member.
	 * @param password
	 *        the password of the member (encoded in MD5).
	 */
	public MemberAuth (final String login, final String password) {
		super(Verb.POST, APIAddresses.MEMBERS_AUTH);
		addParameter(new Login(login));
		addParameter(new Password(password));
	}
}