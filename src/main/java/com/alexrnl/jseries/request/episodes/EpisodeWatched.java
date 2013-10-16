package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Bulk;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Note;

/**
 * Request which allow to mark episodes as seen.<br />
 * @author Alex
 */
public class EpisodeWatched extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param episodeId
	 *        the id of the episode to mark as seen.
	 * @param bulk
	 *        <code>true</code> if the previous episode (i.e. from previous seasons) should be also
	 *        marked as seen.
	 * @param note
	 *        the note of the episode.
	 */
	public EpisodeWatched (final Integer episodeId, final boolean bulk, final Integer note) {
		super(Verb.POST, APIAddresses.EPISODES_WATCHED);
		addParameter(new Id(episodeId));
		if (bulk) {
			addParameter(new Bulk());
		}
		if (note != null) {
			addParameter(new Note(note));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * This will mark <em>all</em> previous episodes as seen.
	 * @param episodeId
	 *        the id of the episode to mark as seen.
	 * @param note
	 *        the note of the episode.
	 * @see #EpisodeWatched(Integer, boolean, Integer)
	 */
	public EpisodeWatched (final Integer episodeId, final Integer note) {
		this(episodeId, true, note);
	}
	
	/**
	 * Constructor #3.<br />
	 * This will mark <em>all</em> previous episodes as seen and leave it unoted.
	 * @param episodeId
	 *        the id of the episode to mark as seen.
	 * @see #EpisodeWatched(Integer, boolean, Integer)
	 */
	public EpisodeWatched (final Integer episodeId) {
		this(episodeId, null);
	}
	
}
