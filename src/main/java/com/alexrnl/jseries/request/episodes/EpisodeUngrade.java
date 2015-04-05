package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdOrTheTVDBIdRequestTemplate;

/**
 * Request for removing the grade of the specified episode.<br />
 * @author Alex
 */
public class EpisodeUngrade extends IdOrTheTVDBIdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episode id is a theTVDB id.
	 * @param episodeId
	 *        the id of the episode to un-grade.
	 */
	public EpisodeUngrade (final boolean theTVDB, final Integer episodeId) {
		super(Verb.DELETE, APIAddresses.EPISODES_GRADE, theTVDB, episodeId);
	}
}
