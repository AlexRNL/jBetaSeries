package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Ids;
import com.alexrnl.jseries.request.parameters.Subtitles;
import com.alexrnl.jseries.request.parameters.TheTVDBIds;

/**
 * Request for getting information on episode(s).<br />
 * @author Alex
 */
public class EpisodeDisplay extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param subtitles
	 *        <code>true</code> if the subtitles should be retrieved as well.
	 * @param theTVDB
	 *        <code>true</code> if the episodes ids are theTVDB ids.
	 * @param episodeIds
	 *        the ids of the episode to display.
	 */
	public EpisodeDisplay (final Boolean subtitles, final Boolean theTVDB, final Integer... episodeIds) {
		super(Verb.GET, APIAddresses.EPISODES_DISPLAY);
		if (episodeIds == null || episodeIds.length == 0) {
			throw new IllegalArgumentException("At least one episode id is required");
		}
		
		if (subtitles) {
			addParameter(new Subtitles());
		}
		if (theTVDB) {
			addParameter(new TheTVDBIds(episodeIds));
		} else {
			addParameter(new Ids(episodeIds));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * Do not request subtitles to be retrieved.
	 * @param episodeIds
	 *        the ids of the episode to display.
	 * @see #EpisodeDisplay(Boolean, Boolean, Integer...)
	 */
	public EpisodeDisplay (final Integer... episodeIds) {
		this(false, false, episodeIds);
	}
}
