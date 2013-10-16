package com.alexrnl.jseries.request.members;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;

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
