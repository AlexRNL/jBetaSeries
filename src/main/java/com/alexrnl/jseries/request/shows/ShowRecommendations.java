package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;

/**
 * Get the recommendations of the logged member.<br />
 * @author Alex
 */
public class ShowRecommendations extends Request {
	
	/**
	 * Constructor #1.<br />
	 */
	public ShowRecommendations () {
		super(Verb.GET, APIAddresses.SHOWS_RECOMMENDATIONS);
	}
}
