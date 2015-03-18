package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Note;

/**
 * Set the note to a show for the logged user.<br />
 * @author Alex
 */
public class ShowNote extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show to note.
	 * @param note
	 *        the note to set for the show.
	 * @throws IllegalArgumentException
	 *         if the not is outside the range [1;5].
	 */
	public ShowNote (final Integer showId, final Integer note) {
		super(Verb.POST, APIAddresses.SHOWS_NOTE);
		addParameter(new Id(showId));
		addParameter(new Note(note));
	}
}
