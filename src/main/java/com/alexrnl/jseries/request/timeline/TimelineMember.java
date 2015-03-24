package com.alexrnl.jseries.request.timeline;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.NumberEventsPerPage;
import com.alexrnl.jseries.request.parameters.SinceId;
import com.alexrnl.jseries.request.parameters.Types;

/**
 * Request for retrieving the last event of a member.<br />
 * @author Alex
 */
public class TimelineMember extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param memberId
	 *        the id of the member whose timeline to retrieve.
	 * @param eventsPerPage
	 *        the number of event per page.
	 * @param lastEvent
	 *        the id of the last event received.
	 * @param types
	 *        the type of events to receive.
	 */
	public TimelineMember (final Integer memberId, final Integer eventsPerPage, final Integer lastEvent, final String... types) {
		super(Verb.GET, APIAddresses.TIMELINE_MEMBER);
		addParameter(new Id(memberId));
		addParameter(new NumberEventsPerPage(eventsPerPage));
		if (lastEvent != null) {
			addParameter(new SinceId(lastEvent));
		}
		if (types != null && types.length > 0) {
			addParameter(new Types(types));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * @param memberId
	 *        the id of the member whose timeline to retrieve.
	 * @param eventsPerPage
	 *        the number of event per page.
	 */
	public TimelineMember (final Integer memberId, final Integer eventsPerPage) {
		this (memberId, eventsPerPage, null);
	}
}
