package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

/**
 * Request which allow to mark episodes as unseen.<br />
 * @author Alex
 */
public class EpisodeUnwatched extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param episodeId
	 *        the id of the episode to mark as unseen.
	 */
	public EpisodeUnwatched (final Integer episodeId) {
		super(Verb.DELETE, APIAddresses.EPISODES_WATCHED);
		addParameter(new Id(episodeId));
	}
}
