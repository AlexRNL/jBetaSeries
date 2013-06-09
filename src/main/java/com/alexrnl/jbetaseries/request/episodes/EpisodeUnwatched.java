package com.alexrnl.jbetaseries.request.episodes;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

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
