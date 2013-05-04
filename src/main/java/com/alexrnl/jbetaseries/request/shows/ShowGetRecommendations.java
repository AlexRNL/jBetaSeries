package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;

/**
 * Get the recommendations of the logged member.<br />
 * @author Alex
 */
public class ShowGetRecommendations extends Request {
	
	/**
	 * Constructor #1.<br />
	 */
	public ShowGetRecommendations () {
		super(Verb.GET, APIAddresses.SHOWS_RECOMMENDATIONS);
	}
}
