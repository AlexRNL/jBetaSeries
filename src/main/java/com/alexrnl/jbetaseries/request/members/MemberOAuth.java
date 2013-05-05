package com.alexrnl.jbetaseries.request.members;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;

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
