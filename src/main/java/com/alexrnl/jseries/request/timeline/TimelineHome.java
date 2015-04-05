package com.alexrnl.jseries.request.timeline;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.TimelineRequestTemplate;

/**
 * Request for retrieving the last event of the whole community.<br />
 * @author Alex
 */
public class TimelineHome extends TimelineRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param eventsPerPage
	 *        the number of event per page.
	 * @param lastEvent
	 *        the id of the last event received.
	 * @param types
	 *        the type of events to receive.
	 */
	public TimelineHome (final Integer eventsPerPage, final Integer lastEvent, final String... types) {
		super(Verb.GET, APIAddresses.TIMELINE_HOME, eventsPerPage, lastEvent, types);
	}
	
	/**
	 * Constructor #2.<br />
	 * @param eventsPerPage
	 *        the number of event per page.
	 */
	public TimelineHome (final Integer eventsPerPage) {
		this (eventsPerPage, null);
	}
}
