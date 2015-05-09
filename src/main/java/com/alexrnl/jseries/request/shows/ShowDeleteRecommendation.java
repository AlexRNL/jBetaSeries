package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdRequestTemplate;

/**
 * Request for deleting a recommendation sent or received.<br />
 * @author Alex
 */
public class ShowDeleteRecommendation extends IdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param recommendationId
	 *        the id of the recommendation to delete.
	 */
	public ShowDeleteRecommendation (final Integer recommendationId) {
		super(Verb.DELETE, APIAddresses.SHOWS_RECOMMENDATION, recommendationId);
	}
}
