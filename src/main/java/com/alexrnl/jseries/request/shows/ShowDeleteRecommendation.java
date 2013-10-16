package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

/**
 * Request for deleting a recommendation from the logged account.<br />
 * @author Alex
 */
public class ShowDeleteRecommendation extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param recommendationId
	 *        the id of the recommendation to delete.
	 */
	public ShowDeleteRecommendation (final Integer recommendationId) {
		super(Verb.DELETE, APIAddresses.SHOWS_RECOMMENDATION);
		addParameter(new Id(recommendationId));
	}
}
