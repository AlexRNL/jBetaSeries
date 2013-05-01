package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.ShowId;

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
		addParameter(new ShowId(recommendationId));
	}
}
