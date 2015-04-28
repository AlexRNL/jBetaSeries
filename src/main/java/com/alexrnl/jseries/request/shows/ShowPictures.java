package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdOrTheTVDBIdRequestTemplate;

/**
 * Retrieve the pictures of the shows, added by the members of BetaSeries.<br />
 * @author Alex
 */
public class ShowPictures extends IdOrTheTVDBIdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the show id is a theTVDB id.
	 * @param showId
	 *        the id of the show.
	 */
	public ShowPictures (final boolean theTVDB, final Integer showId) {
		super(Verb.GET, APIAddresses.SHOWS_PICTURES, theTVDB, showId);
	}
	
	/**
	 * Constructor #2.<br />
	 * @param showId
	 *        the id of the show.
	 */
	public ShowPictures (final Integer showId) {
		this(false, showId);
	}
}
