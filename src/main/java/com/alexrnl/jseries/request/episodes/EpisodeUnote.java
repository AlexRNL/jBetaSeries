package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

/**
 * Request for removing the grade of the specified episode.<br />
 * @author Alex
 */
public class EpisodeUnote extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param episodeId
	 *        the id of the episode to ungrade.
	 */
	public EpisodeUnote (final Integer episodeId) {
		super(Verb.DELETE, APIAddresses.EPISODES_NOTE);
		addParameter(new Id(episodeId));
	}
}
