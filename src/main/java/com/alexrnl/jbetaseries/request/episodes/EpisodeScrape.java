package com.alexrnl.jbetaseries.request.episodes;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.File;

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
