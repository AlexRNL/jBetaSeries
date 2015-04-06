package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdOrTheTVDBIdRequestTemplate;

/**
 * Get the characters associated to the specified show.<br />
 * @author Alex
 */
public class ShowCharacters extends IdOrTheTVDBIdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episode id is a theTVDB id.
	 * @param showId
	 *        the id of the show.
	 */
	public ShowCharacters (final boolean theTVDB, final Integer showId) {
		super(Verb.GET, APIAddresses.SHOWS_CHARACTERS, theTVDB, showId);
	}
	
	/**
	 * Constructor #2.<br />
	 * @param showId
	 *        the id of the show.
	 */
	public ShowCharacters (final Integer showId) {
		this(false, showId);
	}
}
