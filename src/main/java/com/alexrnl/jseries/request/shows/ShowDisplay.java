package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdsOrTheTVDBIdsRequestTemplate;

/**
 * Display one or several shows.<br />
 * @author Alex
 */
public class ShowDisplay extends IdsOrTheTVDBIdsRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episode id is a theTVDB id.
	 * @param ids
	 *        the ids of the show(s) to display.
	 */
	public ShowDisplay (final boolean theTVDB, final Integer... ids) {
		super(Verb.GET, APIAddresses.SHOWS_DISPLAY, theTVDB, ids);
	}
	
	/**
	 * Constructor #2.<br />
	 * @param ids
	 *        the ids of the show(s) to display.
	 */
	public ShowDisplay (final Integer... ids) {
		this(false, ids);
	}
}
