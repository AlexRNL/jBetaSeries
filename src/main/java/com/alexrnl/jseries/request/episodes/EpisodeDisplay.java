package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Ids;
import com.alexrnl.jseries.request.parameters.Subtitles;

/**
 * Request for getting information on episode(s).<br />
 * @author Alex
 */
public class EpisodeDisplay extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param subtitles
	 *        <code>true</code> if the subtitles should be retrieved as well.
	 * @param episodeIds
	 *        the ids of the episode to display.
	 */
	public EpisodeDisplay (final Boolean subtitles, final Integer... episodeIds) {
		super(Verb.GET, APIAddresses.EPISODES_DISPLAY);
		if (subtitles) {
			addParameter(new Subtitles());
		}
		addParameter(new Ids(episodeIds));
	}
	
	/**
	 * Constructor #2.<br />
	 * Do not request subtitles to be retrieved.
	 * @param episodeIds
	 *        the ids of the episode to display.
	 * @see #EpisodeDisplay(Boolean, Integer...)
	 */
	public EpisodeDisplay (final Integer... episodeIds) {
		this(false, episodeIds);
	}
}
