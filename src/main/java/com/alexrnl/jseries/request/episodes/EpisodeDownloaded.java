package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

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
