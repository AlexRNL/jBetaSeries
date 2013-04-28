package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.ShowId;

/**
 * Archive a show in the logged member account.<br />
 * @author Alex
 */
public class ShowArchive extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param id
	 *        the id of the show to archive.
	 */
	public ShowArchive (final Integer id) {
		super(Verb.GET, APIAddresses.SHOWS_ARCHIVE);
		addParameter(new ShowId(id));
	}
	
}
