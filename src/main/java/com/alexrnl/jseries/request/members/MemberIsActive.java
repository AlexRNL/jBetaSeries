package com.alexrnl.jseries.request.members;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;

/**
 * Request for checking the validity of the token.<br />
 * @author Alex
 */
public class MemberIsActive extends Request {
	
	/**
	 * Constructor #1.<br />
	 */
	public MemberIsActive () {
		super(Verb.GET, APIAddresses.MEMBERS_IS_ACTIVE);
	}
}
