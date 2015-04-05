package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdsOrTheTVDBIdsRequestTemplate;

/**
 * Request for retrieving the latest aired episode of a show.<br />
 * @author Alex
 */
public class EpisodeLatest extends IdsOrTheTVDBIdsRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the show id is a theTVDB id.
	 * @param showIds
	 *        the ids of the show.
	 */
	public EpisodeLatest (final boolean theTVDB, final Integer... showIds) {
		super(Verb.GET, APIAddresses.EPISODES_LATEST, theTVDB, showIds);
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
