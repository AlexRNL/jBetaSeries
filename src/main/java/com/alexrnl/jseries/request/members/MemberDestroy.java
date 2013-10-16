package com.alexrnl.jseries.request.members;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;

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
