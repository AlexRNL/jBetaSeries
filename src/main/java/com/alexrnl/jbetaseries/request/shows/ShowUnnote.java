package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

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
