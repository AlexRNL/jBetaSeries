package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Ids;

/**
 * Display one or several shows.<br />
 * @author Alex
 */
public class ShowDisplay extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param ids
	 *        the ids of the show(s) to display.
	 */
	public ShowDisplay (final Integer... ids) {
		super(Verb.GET, APIAddresses.SHOWS_DISPLAY);
		if (ids == null || ids.length == 0) {
			throw new IllegalArgumentException("At least one show id is required");
		}
		addParameter(new Ids(ids));
	}
	
}
