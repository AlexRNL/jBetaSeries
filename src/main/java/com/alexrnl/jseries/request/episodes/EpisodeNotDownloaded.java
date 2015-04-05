package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdOrTheTVDBIdRequestTemplate;

/**
 * Mark an episode as downloaded.<br />
 * @author Alex
 */
public class EpisodeNotDownloaded extends IdOrTheTVDBIdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episode id is a theTVDB id.
	 * @param episodeId
	 *        the id of the episode.
	 */
	public EpisodeNotDownloaded (final boolean theTVDB, final Integer episodeId) {
		super(Verb.DELETE, APIAddresses.EPISODES_DOWNLOADED, theTVDB, episodeId);
	}
}
