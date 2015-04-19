package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdRequestTemplate;

/**
 * Request which allow to unmark as show as favorite.<br />
 * @author Alex
 */
public class ShowUnfavorite extends IdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show to unmark as favorite.
	 */
	public ShowUnfavorite (final Integer showId) {
		super(Verb.DELETE, APIAddresses.SHOWS_FAVORITE, showId);
	}
}
