package com.alexrnl.jbetaseries.request.members;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Mails;

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
		addParameter(new Mails(emails));
	}
}
