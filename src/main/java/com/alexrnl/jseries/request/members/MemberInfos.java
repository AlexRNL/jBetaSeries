package com.alexrnl.jseries.request.members;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

/**
 * Request for getting the info of a member.<br />
 * @author Alex
 */
public class MemberInfos extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param memberId
	 *        the id of the member.
	 */
	public MemberInfos (final Integer memberId) {
		super(Verb.GET, APIAddresses.MEMBERS_INFOS);
		addParameter(new Id(memberId));
	}
}
