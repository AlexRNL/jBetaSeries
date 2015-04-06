package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdOrTheTVDBIdRequestTemplate;

/**
 * Archive a show in the logged member account.<br />
 * @author Alex
 */
public class ShowArchive extends IdOrTheTVDBIdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episode id is a theTVDB id.
	 * @param id
	 *        the id of the show to archive.
	 */
	public ShowArchive (final boolean theTVDB, final Integer id) {
		super(Verb.POST, APIAddresses.SHOWS_ARCHIVE, theTVDB, id);
	}
	
}
