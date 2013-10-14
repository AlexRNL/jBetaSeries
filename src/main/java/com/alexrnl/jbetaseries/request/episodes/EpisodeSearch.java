package com.alexrnl.jbetaseries.request.episodes;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.NumberStr;
import com.alexrnl.jbetaseries.request.parameters.ShowId;

/**
 * Request for searching for a specific episode, using its show id and it number in the series.
 * @author Alex
 */
public class EpisodeSearch extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show.
	 * @param episodeString
	 *        the number of the episode, of the form <code>SXXEXX</code>.
	 */
	public EpisodeSearch (final Integer showId, final String episodeString) {
		super(Verb.GET, APIAddresses.EPISODES_SEARCH);
		addParameter(new ShowId(showId));
		addParameter(new NumberStr(episodeString));
	}
	
	/**
	 * Constructor #2.<br />
	 * @param showId
	 *        the id of the show.
	 * @param globalNumber
	 *        the global number of the episode.
	 */
	public EpisodeSearch (final Integer showId, final Integer globalNumber) {
		this(showId, globalNumber.toString());
	}
}
