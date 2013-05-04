package com.alexrnl.jbetaseries.request.members;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

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
