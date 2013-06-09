package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

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
