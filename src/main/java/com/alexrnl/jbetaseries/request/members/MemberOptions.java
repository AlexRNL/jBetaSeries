package com.alexrnl.jbetaseries.request.members;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;

/**
 * Request for getting the member's option.<br />
 * @author Alex
 */
public class MemberOptions extends Request {
	
	/**
	 * Constructor #1.<br />
	 */
	public MemberOptions () {
		super(Verb.GET, APIAddresses.MEMBERS_OPTIONS);
	}
}
