package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Ids;
import com.alexrnl.jseries.request.parameters.TheTVDBIds;

/**
 * Request for retrieving the latest aired episode of a show.<br />
 * @author Alex
 */
public class EpisodeLatest extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the show id is a theTVDB id.
	 * @param showIds
	 *        the ids of the show.
	 */
	public EpisodeLatest (final Boolean theTVDB, final Integer... showIds) {
		super(Verb.GET, APIAddresses.EPISODES_LATEST);
		if (showIds == null || showIds.length == 0) {
			throw new IllegalArgumentException("At least one show id is required");
		}
		
		if (theTVDB) {
			addParameter(new TheTVDBIds(showIds));
		} else {
			addParameter(new Ids(showIds));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * @param showIds
	 *        the ids of the show.
	 */
	public EpisodeLatest (final Integer... showIds) {
		this(false, showIds);
	}
}
