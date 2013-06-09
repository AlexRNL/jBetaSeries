package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

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
