package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

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
		addParameter(new Id(id));
	}
	
}
