package com.alexrnl.jbetaseries.request.episodes;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Limit;
import com.alexrnl.jbetaseries.request.parameters.ShowId;
import com.alexrnl.jbetaseries.request.parameters.Subtitles;
import com.alexrnl.jbetaseries.request.parameters.Subtitles.Filter;

/**
 * Request for getting a list of episodes to watch.<br />
 * @author Alex
 */
public class EpisodeList extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show.
	 * @param limit
	 *        the episode number limit.
	 * @param subtitles
	 *        filter episode per subtitle availability.
	 */
	public EpisodeList (final Integer showId, final Integer limit, final Subtitles.Filter subtitles) {
		super(Verb.GET, APIAddresses.EPISODES_LIST);
		if (showId != null) {
			addParameter(new ShowId(showId));
		}
		if (limit != null) {
			addParameter(new Limit(limit));
		}
		if (subtitles != null) {
			addParameter(new Subtitles(subtitles));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * Default constructor.
	 */
	public EpisodeList () {
		this(null, null, null);
	}
	
	/**
	 * Constructor #3.<br />
	 * @param showId the id of the show.
	 */
	public EpisodeList (final Integer showId) {
		this(showId, null, null);
	}
	
	/**
	 * Constructor #4.<br />
	 * @param subtitles
	 *        filter episode per subtitle availability.
	 */
	public EpisodeList (final Filter subtitles) {
		this(null, null, subtitles);
	}
	
	/**
	 * Constructor #5.<br />
	 * @param showId
	 *        the id of the show.
	 * @param limit
	 *        the episode number limit.
	 */
	public EpisodeList (final Integer showId, final Integer limit) {
		this(showId, limit, null);
	}
	
	/**
	 * Constructor #6.<br />
	 * @param showId
	 *        the id of the show.
	 * @param subtitles
	 *        filter episode per subtitle availability.
	 */
	public EpisodeList (final Integer showId, final Filter subtitles) {
		this(showId, null, subtitles);
	}
	
	/**
	 * Constructor #6.<br />
	 * @param subtitles
	 *        filter episode per subtitle availability.
	 * @param limit
	 *        the episode number limit.
	 */
	public EpisodeList (final Filter subtitles, final Integer limit) {
		this(null, limit, subtitles);
	}
}
