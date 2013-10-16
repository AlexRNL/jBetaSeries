package com.alexrnl.jseries.request.members;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Find;

/**
 * Method which allow to reset a password for a member.<br />
 * @author Alex
 */
public class MemberLost extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param email
	 *        the email address of the member to find.
	 */
	public MemberLost (final String email) {
		super(Verb.POST, APIAddresses.MEMBERS_LOST);
		addParameter(new Find(email));
	}
}
