package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;

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
