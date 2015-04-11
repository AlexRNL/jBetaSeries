package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Episode;
import com.alexrnl.jseries.request.parameters.Season;
import com.alexrnl.jseries.request.parameters.Subtitles;
import com.alexrnl.jseries.request.template.IdOrTheTVDBIdRequestTemplate;

/**
 * Retrieve the episode of a given show.<br />
 * The season / episode may be set to lighten the response.
 * @author Alex
 */
public class ShowEpisodes extends IdOrTheTVDBIdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episode id is a theTVDB id.
	 * @param showId
	 *        the id of the show.
	 * @param seasonNumber
	 *        the number of the season (<code>null</code> for ignored).
	 * @param episodeNumber
	 *        the number of the episode (<code>null</code> for ignored).
	 * @param subtitles
	 *        <code>true</code> if the subtitle should be returned.
	 * @throws IllegalArgumentException
	 *         if the episode number is set while the season number is left to <code>null</code>.
	 */
	public ShowEpisodes (final boolean theTVDB, final Integer showId, final Integer seasonNumber,
			final Integer episodeNumber, final boolean subtitles) {
		super(Verb.GET, APIAddresses.SHOWS_EPISODES, theTVDB, showId);
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
		if (subtitles) {
			addParameter(new Subtitles());
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * @param showId
	 *        the id of the show.
	 * @param seasonNumber
	 *        the number of the season (<code>null</code> for ignored).
	 * @param subtitles
	 *        <code>true</code> if the subtitle should be returned.
	 */
	public ShowEpisodes (final Integer showId, final Integer seasonNumber, final boolean subtitles) {
		this(false, showId, seasonNumber, null, subtitles);
	}
	
	/**
	 * Constructor #3.<br />
	 * @param showId
	 *        the id of the show.
	 * @param seasonNumber
	 *        the number of the season (<code>null</code> for ignored).
	 */
	public ShowEpisodes (final Integer showId, final Integer seasonNumber) {
		this(showId, seasonNumber, false);
	}
	
	/**
	 * Constructor #4.<br />
	 * @param showId
	 *        the id of the show.
	 */
	public ShowEpisodes (final Integer showId) {
		this(showId, null);
	}
	
	/**
	 * Constructor #5.<br />
	 * @param showId
	 *        the id of the show.
	 * @param seasonNumber
	 *        the number of the season (<code>null</code> for ignored).
	 * @param episodeNumber
	 *        the number of the episode (<code>null</code> for ignored).
	 */
	public ShowEpisodes (final Integer showId, final Integer seasonNumber, final Integer episodeNumber) {
		this(false, showId, seasonNumber, episodeNumber, false);
	}
}
