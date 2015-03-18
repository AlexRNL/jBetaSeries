package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.TheTVDBId;

/**
 * Mark an episode as downloaded.<br />
 * @author Alex
 */
public class EpisodeNotDownloaded extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episodes id is a theTVDB id.
	 * @param episodeId
	 *        the id of the episode.
	 */
	public EpisodeNotDownloaded (final Boolean theTVDB, final Integer episodeId) {
		super(Verb.DELETE, APIAddresses.EPISODES_DOWNLOADED);
		if (theTVDB) {
			addParameter(new TheTVDBId(episodeId));
		} else {
			addParameter(new Id(episodeId));
		}
	}
}
