package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.TheTVDBId;

/**
 * Request for removing the grade of the specified episode.<br />
 * @author Alex
 */
public class EpisodeUngrade extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episode id is a theTVDB id.
	 * @param episodeId
	 *        the id of the episode to un-grade.
	 */
	public EpisodeUngrade (final Boolean theTVDB, final Integer episodeId) {
		super(Verb.DELETE, APIAddresses.EPISODES_GRADE);
		if (theTVDB) {
			addParameter(new TheTVDBId(episodeId));
		} else {
			addParameter(new Id(episodeId));
		}
	}
}
