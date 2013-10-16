package com.alexrnl.jseries.request.members;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

/**
 * Get the badge of the member.<br />
 * @author Alex
 */
public class MemberBagdes extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param memberId
	 *        the id of the member.
	 */
	public MemberBagdes (final Integer memberId) {
		super(Verb.GET, APIAddresses.MEMBERS_BADGES);
		addParameter(new Id(memberId));
	}
}
