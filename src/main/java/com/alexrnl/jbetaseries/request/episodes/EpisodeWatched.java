package com.alexrnl.jbetaseries.request.episodes;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Bulk;
import com.alexrnl.jbetaseries.request.parameters.Id;

/**
 * Request which allow to mark episodes as seen.<br />
 * @author Alex
 */
public class EpisodeWatched extends Request {
	
	/**
	 * Constructor #.<br />
	 * @param episodeId
	 *        the id of the episode to mark as seen.
	 * @param bulk
	 *        <code>true</code> if the previous episode (i.e. from previous seasons) should be also
	 *        marked as seen.
	 */
	public EpisodeWatched (final Integer episodeId, final boolean bulk) {
		super(Verb.POST, APIAddresses.EPISODES_WATCHED);
		addParameter(new Id(episodeId));
		if (bulk) {
			addParameter(new Bulk());
		}
	}
}
