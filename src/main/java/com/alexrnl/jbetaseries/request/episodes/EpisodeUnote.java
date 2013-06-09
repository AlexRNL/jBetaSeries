package com.alexrnl.jbetaseries.request.episodes;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

/**
 * Request for removing the grade of the specified episode.<br />
 * @author Alex
 */
public class EpisodeUnote extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param episodeId
	 *        the id of the episode to ungrade.
	 */
	public EpisodeUnote (final Integer episodeId) {
		super(Verb.DELETE, APIAddresses.EPISODES_NOTE);
		addParameter(new Id(episodeId));
	}
}
