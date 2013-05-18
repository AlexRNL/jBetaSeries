package com.alexrnl.jbetaseries.request.episodes;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

/**
 * Mark an episode as downloaded.<br />
 * @author Alex
 */
public class EpisodeDownloaded extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param episodeId
	 *        the id of the episode.
	 */
	public EpisodeDownloaded (final Integer episodeId) {
		super(Verb.POST, APIAddresses.EPISODES_DOWNLOADED);
		addParameter(new Id(episodeId));
	}
}
