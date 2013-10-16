package com.alexrnl.jseries.request.members;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;

/**
 * Request to authenticate users using OAuth.<br />
 * @author Alex
 */
public class MemberOAuth extends Request {
	
	/**
	 * Constructor #1.<br />
	 */
	public MemberOAuth () {
		super(Verb.POST, APIAddresses.MEMBERS_OAUTH);
	}
}
