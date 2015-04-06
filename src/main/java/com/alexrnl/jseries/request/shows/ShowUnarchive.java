package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdOrTheTVDBIdRequestTemplate;

/**
 * Un-archive a show in the logged member account.<br />
 * @author Alex
 */
public class ShowUnarchive extends IdOrTheTVDBIdRequestTemplate {

	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episode id is a theTVDB id.
	 * @param id
	 *        the id of the show to archive.
	 */
	public ShowUnarchive (final boolean theTVDB, final Integer id) {
		super(Verb.DELETE, APIAddresses.SHOWS_ARCHIVE, theTVDB, id);
	}
	
	/**
	 * Constructor #2.<br />
	 * @param id
	 *        the id of the show to archive.
	 */
	public ShowUnarchive (final Integer id) {
		this(false, id);
	}
}
