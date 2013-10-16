package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

/**
 * Get the shows which are marked as similar to the current one.<br />
 * @author Alex
 */
public class ShowSimilars extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show.
	 */
	public ShowSimilars (final Integer showId) {
		super(Verb.GET, APIAddresses.SHOWS_SIMILARS);
		addParameter(new Id(showId));
	}
}
