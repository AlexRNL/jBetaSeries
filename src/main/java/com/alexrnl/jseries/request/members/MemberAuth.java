package com.alexrnl.jseries.request.members;

import com.alexrnl.commons.utils.StringUtils;
import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Login;
import com.alexrnl.jseries.request.parameters.Password;

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
	 *        the password of the member in clear text; <em>will later be encoded in MD5</em>.
	 */
	public MemberAuth (final String login, final String password) {
		super(Verb.POST, APIAddresses.MEMBERS_AUTH);
		addParameter(new Login(login));
		addParameter(new Password(StringUtils.getMD5(password)));
	}
}
