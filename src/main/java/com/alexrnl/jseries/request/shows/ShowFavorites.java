package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

/**
 * Request which retrieves the favorite shows of a member.<br />
 * @author Alex
 */
public class ShowFavorites extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param memberId
	 *        the id of the member to retrieve favorite (<code>null</code> for the logged member).
	 */
	public ShowFavorites (final Integer memberId) {
		super(Verb.GET, APIAddresses.SHOWS_FAVORITES);
		if (memberId != null) {
			addParameter(new Id(memberId));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * Default constructor, request the show of the logged member.
	 */
	public ShowFavorites () {
		this(null);
	}
	
}
