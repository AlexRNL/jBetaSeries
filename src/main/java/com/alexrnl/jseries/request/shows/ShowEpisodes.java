package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Episode;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Season;

/**
 * Retrieve the episode of a given show.<br />
 * The season / episode may be set to lighten the response.
 * @author Alex
 */
public class ShowEpisodes extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show.
	 * @param seasonNumber
	 *        the number of the season (<code>null</code> for ignored).
	 * @param episodeNumber
	 *        the number of the episode (<code>null</code> for ignored).
	 * @throws IllegalArgumentException
	 *         if the episode number is set while the season number is left to <code>null</code>.
	 */
	public ShowEpisodes (final Integer showId, final Integer seasonNumber, final Integer episodeNumber) {
		super(Verb.GET, APIAddresses.SHOWS_EPISODES);
		addParameter(new Id(showId));
		if (seasonNumber == null && episodeNumber != null) {
			throw new IllegalArgumentException("The episode number cannot be set if the season" +
					"number is missing.");
		}
		if (seasonNumber != null) {
			addParameter(new Season(seasonNumber));
		}
		if (episodeNumber != null) {
			addParameter(new Episode(episodeNumber));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * @param showId
	 *        the id of the show.
	 * @param seasonNumber
	 *        the number of the season (<code>null</code> for ignored).
	 */
	public ShowEpisodes (final Integer showId, final Integer seasonNumber) {
		this(showId, seasonNumber, null);
	}
	
	/**
	 * Constructor #3.<br />
	 * @param showId
	 *        the id of the show.
	 */
	public ShowEpisodes (final Integer showId) {
		this(showId, null);
	}
}
