package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

/**
 * Remove a show from the logged member's account.<br />
 * @author Alex
 */
public class ShowDeleteShow extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show to remove.
	 */
	public ShowDeleteShow (final Integer showId) {
		super(Verb.DELETE, APIAddresses.SHOWS_SHOW);
		addParameter(new Id(showId));
	}
}
