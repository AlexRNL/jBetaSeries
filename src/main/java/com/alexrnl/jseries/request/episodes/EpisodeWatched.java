package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Bulk;
import com.alexrnl.jseries.request.parameters.Delete;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Note;
import com.alexrnl.jseries.request.parameters.TheTVDBId;

/**
 * Request which allow to mark episodes as seen.<br />
 * @author Alex
 */
public class EpisodeWatched extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episodes ids are theTVDB ids.
	 * @param episodeId
	 *        the id of the episode to mark as seen.
	 * @param bulk
	 *        <code>true</code> if the previous episode (i.e. from previous seasons) should be also
	 *        marked as seen.
	 * @param delete <code>true</code>
	 * @param note
	 *        the note of the episode.
	 */
	public EpisodeWatched (final Boolean theTVDB, final Integer episodeId, final Boolean bulk, final Boolean delete, final Integer note) {
		super(Verb.POST, APIAddresses.EPISODES_WATCHED);
		if (theTVDB) {
			addParameter(new TheTVDBId(episodeId));
		} else {
			addParameter(new Id(episodeId));
		}
		if (bulk != null) {
			addParameter(new Bulk(bulk));
		}
		if (delete != null) {
			addParameter(new Delete(delete));
		}
		if (note != null) {
			addParameter(new Note(note));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * @param episodeId
	 *        the id of the episode to mark as seen.
	 * @param bulk
	 *        <code>true</code> if the previous episode (i.e. from previous seasons) should be also
	 *        marked as seen.
	 * @param delete <code>true</code>
	 * @param note
	 *        the note of the episode.
	 */
	public EpisodeWatched (final Integer episodeId, final Boolean bulk, final Boolean delete, final Integer note) {
		this(false, episodeId, bulk, delete, note);
	}
	
	/**
	 * Constructor #3.<br />
	 * This will mark <em>all</em> previous episodes as seen.
	 * @param episodeId
	 *        the id of the episode to mark as seen.
	 * @param note
	 *        the note of the episode.
	 * @see #EpisodeWatched(Integer, Boolean, Boolean, Integer)
	 */
	public EpisodeWatched (final Integer episodeId, final Integer note) {
		this(episodeId, null, null, note);
	}
	
	/**
	 * Constructor #4.<br />
	 * This will mark <em>all</em> previous episodes as seen and leave it unmarked.
	 * @param episodeId
	 *        the id of the episode to mark as seen.
	 * @see #EpisodeWatched(Integer, Boolean, Boolean, Integer)
	 */
	public EpisodeWatched (final Integer episodeId) {
		this(episodeId, null);
	}
	
}
