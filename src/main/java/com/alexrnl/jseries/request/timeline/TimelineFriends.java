package com.alexrnl.jseries.request.timeline;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.TimelineRequestTemplate;

/**
 * Request for retrieving the last event of the identified member's friend.<br />
 * @author Alex
 */
public class TimelineFriends extends TimelineRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param eventsPerPage
	 *        the number of event per page.
	 * @param lastEvent
	 *        the id of the last event received.
	 * @param types
	 *        the type of events to receive.
	 */
	public TimelineFriends (final Integer eventsPerPage, final Integer lastEvent, final String... types) {
		super(Verb.GET, APIAddresses.TIMELINE_FRIENDS, eventsPerPage, lastEvent, types);
	}
	
	/**
	 * Constructor #2.<br />
	 * @param eventsPerPage
	 *        the number of event per page.
	 */
	public TimelineFriends (final Integer eventsPerPage) {
		this (eventsPerPage, null);
	}
}
