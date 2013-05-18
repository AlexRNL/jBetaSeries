package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Ids;

/**
 * Display one or several shows.<br />
 * @author Alex
 */
public class ShowDisplay extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param ids
	 *        the ids of the show(s) to display.
	 */
	public ShowDisplay (final Integer... ids) {
		super(Verb.GET, APIAddresses.SHOWS_DISPLAY);
		addParameter(new Ids(ids));
	}
	
}
