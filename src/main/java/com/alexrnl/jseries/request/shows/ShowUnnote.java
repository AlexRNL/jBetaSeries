package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

/**
 * Unset the note on a given show for the identified user.<br />
 * @author Alex
 */
public class ShowUnnote extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show.
	 */
	public ShowUnnote (final Integer showId) {
		super(Verb.DELETE, APIAddresses.SHOWS_NOTE);
		addParameter(new Id(showId));
	}
}
