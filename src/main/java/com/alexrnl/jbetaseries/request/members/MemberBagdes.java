package com.alexrnl.jbetaseries.request.members;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

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
