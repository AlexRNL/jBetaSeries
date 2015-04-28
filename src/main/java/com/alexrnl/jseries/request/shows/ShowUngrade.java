package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdOrTheTVDBIdRequestTemplate;

/**
 * Unset the grade on a given show for the identified user.<br />
 * @author Alex
 */
public class ShowUngrade extends IdOrTheTVDBIdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episode id is a theTVDB id.
	 * @param showId
	 *        the id of the show.
	 */
	public ShowUngrade (final boolean theTVDB, final Integer showId) {
		super(Verb.DELETE, APIAddresses.SHOWS_GRADE, theTVDB, showId);
	}
}
