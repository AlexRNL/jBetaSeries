package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Ids;

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
