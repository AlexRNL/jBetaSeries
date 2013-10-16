package com.alexrnl.jseries.request.members;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Mails;

/**
 * Search BetaSeries' database for members from a list of e-mails addresses.<br />
 * @author Alex
 */
public class MemberSync extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param emails
	 *        the emails to check.
	 */
	public MemberSync (final String... emails) {
		super(Verb.POST, APIAddresses.MEMBERS_SYNC);
		for (final String email : emails) {
			addParameter(new Mails(email));
		}
	}
}
