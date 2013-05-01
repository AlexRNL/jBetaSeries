package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Title;

/**
 * Search for shows matching a given query.<br />
 * @author Alex
 */
public class ShowSearch extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param query
	 *        the string to look for in the title of the shows.
	 */
	public ShowSearch (final String query) {
		super(Verb.GET, APIAddresses.SHOWS_SEARCH);
		addParameter(new Title(query));
	}
}
