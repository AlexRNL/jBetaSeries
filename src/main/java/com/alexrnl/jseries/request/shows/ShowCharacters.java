package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

/**
 * Get the characters associated to the specified show.<br />
 * @author Alex
 */
public class ShowCharacters extends Request {
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show.
	 */
	public ShowCharacters (final Integer showId) {
		super(Verb.GET, APIAddresses.SHOWS_CHARACTERS);
		addParameter(new Id(showId));
	}
}
