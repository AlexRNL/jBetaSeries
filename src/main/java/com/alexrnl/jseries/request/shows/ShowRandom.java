package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Nb;
import com.alexrnl.jseries.request.parameters.Summary;

/**
 * Retrieve random shows from the API.<br />
 * @author Alex
 */
public class ShowRandom extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param number
	 *        the number of shows to retrieve.
	 * @param summary
	 *        <code>true</code> to return only the shows main informations.
	 */
	public ShowRandom (final Integer number, final Boolean summary) {
		super(Verb.GET, APIAddresses.SHOWS_RANDOM);
		if (number != null) {
			addParameter(new Nb(number));
		}
		if (summary != null) {
			addParameter(new Summary(summary));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * @param number
	 *        the number of shows to retrieve.
	 */
	public ShowRandom (final Integer number) {
		this(number, null);
	}
	
	/**
	 * Constructor #3.<br />
	 * @param summary
	 *        <code>true</code> to return only the shows main informations.
	 */
	public ShowRandom (final Boolean summary) {
		this(null, summary);
	}
	
	/**
	 * Constructor #4.<br />
	 */
	public ShowRandom () {
		this(null, null);
	}
}
