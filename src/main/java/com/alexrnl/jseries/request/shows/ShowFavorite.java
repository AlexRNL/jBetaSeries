package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdRequestTemplate;

/**
 * Request which allow to mark as show as favorite.<br />
 * @author Alex
 */
public class ShowFavorite extends IdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show to mark as favorite.
	 */
	public ShowFavorite (final Integer showId) {
		super(Verb.POST, APIAddresses.SHOWS_FAVORITE, showId);
	}
}
