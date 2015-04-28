package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Note;
import com.alexrnl.jseries.request.template.IdOrTheTVDBIdRequestTemplate;

/**
 * Set the grade to a show for the logged user.<br />
 * @author Alex
 */
public class ShowGrade extends IdOrTheTVDBIdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the episode id is a theTVDB id.
	 * @param showId
	 *        the id of the show to note.
	 * @param note
	 *        the note to set for the show.
	 * @throws IllegalArgumentException
	 *         if the not is outside the range [1;5].
	 */
	public ShowGrade (final boolean theTVDB, final Integer showId, final Integer note) {
		super(Verb.POST, APIAddresses.SHOWS_GRADE, theTVDB, showId);
		addParameter(new Note(note));
	}
}
