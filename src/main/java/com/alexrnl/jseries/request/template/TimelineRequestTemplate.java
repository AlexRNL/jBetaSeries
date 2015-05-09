package com.alexrnl.jseries.request.template;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.NumberResultsPerPage;
import com.alexrnl.jseries.request.parameters.SinceId;
import com.alexrnl.jseries.request.parameters.Types;

/**
 * Template for the timeline requests.<br />
 * @author Alex
 */
public class TimelineRequestTemplate extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param verb
	 *        the verb of the request.
	 * @param method
	 *        the method of the request.
	 * @param eventsPerPage
	 *        the number of event per page.
	 * @param lastEvent
	 *        the id of the last event received.
	 * @param types
	 *        the type of events to receive.
	 */
	public TimelineRequestTemplate (final Verb verb, final String method, final Integer eventsPerPage,
			final Integer lastEvent, final String... types) {
		super(verb, method);
		addParameter(new NumberResultsPerPage(eventsPerPage));
		if (lastEvent != null) {
			addParameter(new SinceId(lastEvent));
		}
		if (types != null && types.length > 0) {
			addParameter(new Types(types));
		}
	}
}
