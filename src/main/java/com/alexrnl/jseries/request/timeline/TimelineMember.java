package com.alexrnl.jseries.request.timeline;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.template.TimelineRequestTemplate;

/**
 * Request for retrieving the last event of a member.<br />
 * @author Alex
 */
public class TimelineMember extends TimelineRequestTemplate {
	
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
		super(Verb.GET, APIAddresses.TIMELINE_MEMBER, eventsPerPage, lastEvent, types);
		addParameter(new Id(memberId));
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
