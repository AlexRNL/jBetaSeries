package com.alexrnl.jbetaseries.request.episodes;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Ids;

/**
 * Request for getting information on episode(s).<br />
 * @author Alex
 */
public class EpisodeDisplay extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param episodeIds
	 *        the ids of the episode to display.
	 */
	public EpisodeDisplay (final Integer... episodeIds) {
		super(Verb.GET, APIAddresses.EPISODES_DISPLAY);
		addParameter(new Ids(episodeIds));
	}
}
