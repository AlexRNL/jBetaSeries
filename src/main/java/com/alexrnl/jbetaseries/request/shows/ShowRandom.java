package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;

/**
 * Retrieve a random show from the API.<br />
 * @author Alex
 */
public class ShowRandom extends Request {
	
	/**
	 * Constructor #1.<br />
	 */
	public ShowRandom () {
		super(Verb.GET, APIAddresses.SHOWS_RANDOM);
	}
}
