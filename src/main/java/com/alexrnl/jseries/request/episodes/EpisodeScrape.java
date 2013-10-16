package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.File;

/**
 * Request for scraping a file and returning the matching episode, depending on the file's name.<br />
 * @author Alex
 */
public class EpisodeScrape extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param file
	 *        the file to scrape.
	 */
	public EpisodeScrape (final String file) {
		super(Verb.GET, APIAddresses.EPISODES_SCRAPE);
		addParameter(new File(file));
	}
}
