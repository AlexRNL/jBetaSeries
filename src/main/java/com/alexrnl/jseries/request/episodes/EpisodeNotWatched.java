package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdOrTheTVDBIdRequestTemplate;

/**
 * Request which allow to mark episodes as not watched.<br />
 * @author Alex
 */
public class EpisodeNotWatched extends IdOrTheTVDBIdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episode id is a theTVDB id.
	 * @param episodeId
	 *        the id of the episode to mark as unseen.
	 */
	public EpisodeNotWatched (final boolean theTVDB, final Integer episodeId) {
		super(Verb.DELETE, APIAddresses.EPISODES_WATCHED, theTVDB, episodeId);
	}
}
