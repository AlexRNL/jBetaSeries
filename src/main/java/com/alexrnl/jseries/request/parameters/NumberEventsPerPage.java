package com.alexrnl.jseries.request.parameters;

import static com.alexrnl.jseries.request.APIConstants.MAXIMUM_NUMBER_OF_EVENTS_PER_PAGE;

/**
 * Parameter which allow to set the number of events per page.<br />
 * @author Alex
 */
public class NumberEventsPerPage extends Parameter<Integer> {
	/** The name of the number parameter */
	public static final String	PARAMETER_NUMBER_EVENTS_PER_PAGE	= "nbpp";
	
	/**
	 * Constructor #1.<br />
	 * @param eventsPerPage
	 *        the number of items to set.
	 * @throws IllegalArgumentException
	 *         if the number of events per page is negative, null or over
	 *         {@link #MAXIMUM_NUMBER_OF_EVENTS_PER_PAGE}.
	 */
	public NumberEventsPerPage (final Integer eventsPerPage) {
		super(PARAMETER_NUMBER_EVENTS_PER_PAGE, eventsPerPage);
		if (eventsPerPage <= 0) {
			throw new IllegalArgumentException("The number of event per page must be positive");
		}
		if (eventsPerPage > MAXIMUM_NUMBER_OF_EVENTS_PER_PAGE) {
			throw new IllegalArgumentException("The number of event per page must be lower than "
					+ MAXIMUM_NUMBER_OF_EVENTS_PER_PAGE);
		}
	}
	
}
