package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

/**
 * Add the show to the logged member's account.<br />
 * @author Alex
 */
public class ShowsShow extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show to add.
	 */
	public ShowsShow (final Integer showId) {
		super(Verb.POST, APIAddresses.SHOWS_SHOW);
		addParameter(new Id(showId));
	}
}
