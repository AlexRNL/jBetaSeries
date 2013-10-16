package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

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
