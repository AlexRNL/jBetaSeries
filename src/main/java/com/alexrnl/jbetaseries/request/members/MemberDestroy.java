package com.alexrnl.jbetaseries.request.members;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;

/**
 * Request which destroy (invalid) the token.<br />
 * @author Alex
 */
public class MemberDestroy extends Request {
	
	/**
	 * Constructor #1.<br />
	 */
	public MemberDestroy () {
		super(Verb.POST, APIAddresses.MEMBERS_DESTROY);
	}
}
