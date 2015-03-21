package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.NumberStr;
import com.alexrnl.jseries.request.parameters.ShowId;
import com.alexrnl.jseries.request.parameters.Subtitles;

/**
 * Request for searching for a specific episode, using its show id and it number in the series.<br />
 * @author Alex
 */
public class EpisodeSearch extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show.
	 * @param episodeString
	 *        the number of the episode, of the form <code>SXXEXX</code>.
	 * @param subtitles
	 *        if <code>true</code> request the subtitles of the episode.
	 */
	public EpisodeSearch (final Integer showId, final String episodeString, final Boolean subtitles) {
		super(Verb.GET, APIAddresses.EPISODES_SEARCH);
		addParameter(new ShowId(showId));
		addParameter(new NumberStr(episodeString));
		if (subtitles) {
			addParameter(new Subtitles());
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * @param showId
	 *        the id of the show.
	 * @param globalNumber
	 *        the global number of the episode.
	 * @param subtitles
	 *        if <code>true</code> request the subtitles of the episode.
	 */
	public EpisodeSearch (final Integer showId, final Integer globalNumber, final Boolean subtitles) {
		this(showId, globalNumber.toString(), subtitles);
	}
	
	/**
	 * Constructor #3.<br />
	 * @param showId
	 *        the id of the show.
	 * @param episodeString
	 *        the number of the episode, of the form <code>SXXEXX</code>.
	 */
	public EpisodeSearch (final Integer showId, final String episodeString) {
		this(showId, episodeString, false);
	}
	
	/**
	 * Constructor #4.<br />
	 * @param showId
	 *        the id of the show.
	 * @param globalNumber
	 *        the global number of the episode.
	 */
	public EpisodeSearch (final Integer showId, final Integer globalNumber) {
		this(showId, globalNumber, false);
	}
}
