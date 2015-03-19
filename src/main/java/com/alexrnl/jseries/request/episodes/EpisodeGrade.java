package com.alexrnl.jseries.request.episodes;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Note;
import com.alexrnl.jseries.request.parameters.TheTVDBId;

/**
 * Request for grading the specified episode.<br />
 * @author Alex
 */
public class EpisodeGrade extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episode id is a theTVDB id.
	 * @param episodeId
	 *        the id of the episode to grade.
	 * @param grade
	 *        the note of the episode.
	 */
	public EpisodeGrade (final Boolean theTVDB, final Integer episodeId, final Integer grade) {
		super(Verb.POST, APIAddresses.EPISODES_GRADE);
		if (theTVDB) {
			addParameter(new TheTVDBId(episodeId));
		} else {
			addParameter(new Id(episodeId));
		}
		addParameter(new Note(grade));
	}
}
