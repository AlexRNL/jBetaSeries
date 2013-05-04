package com.alexrnl.jbetaseries.request.members;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;

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
