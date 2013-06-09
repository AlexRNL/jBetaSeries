package com.alexrnl.jbetaseries.request.episodes;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;
import com.alexrnl.jbetaseries.request.parameters.Note;

/**
 * Request for grading the specified episode.<br />
 * @author Alex
 */
public class EpisodeNote extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param episodeId
	 *        the id of the episode to grade.
	 * @param note
	 *        the note of the episode.
	 */
	public EpisodeNote (final Integer episodeId, final Integer note) {
		super(Verb.POST, APIAddresses.EPISODES_NOTE);
		addParameter(new Id(episodeId));
		addParameter(new Note(note));
	}
}
