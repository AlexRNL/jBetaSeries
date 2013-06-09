package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

/**
 * Get the videos of the specified show.<br />
 * @author Alex
 */
public class ShowVideos extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show.
	 */
	public ShowVideos (final Integer showId) {
		super(Verb.GET, APIAddresses.SHOWS_VIDEOS);
		addParameter(new Id(showId));
	}
}
