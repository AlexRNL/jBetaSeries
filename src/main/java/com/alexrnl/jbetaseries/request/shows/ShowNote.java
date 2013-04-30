package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Note;
import com.alexrnl.jbetaseries.request.parameters.ShowId;

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
	 */
	public ShowNote (final Integer showId, final Integer note) {
		super(Verb.POST, APIAddresses.SHOWS_NOTE);
		addParameter(new ShowId(showId));
		addParameter(new Note(note));
	}
}
