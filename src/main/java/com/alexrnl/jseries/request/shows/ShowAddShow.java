package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

/**
 * Add the show to the logged member's account.<br />
 * @author Alex
 */
public class ShowAddShow extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show to add.
	 */
	public ShowAddShow (final Integer showId) {
		super(Verb.POST, APIAddresses.SHOWS_SHOW);
		addParameter(new Id(showId));
	}
}
