package com.alexrnl.jseries.request.parameters;

import static com.alexrnl.jseries.request.APIConstants.NOTE_MAX;
import static com.alexrnl.jseries.request.APIConstants.NOTE_MIN;

/**
 * Parameter which allow to set the note of a show or an episode.<br />
 * @author Alex
 */
public class Note extends Parameter<Integer> {
	/** Name of the note parameter */
	public static final String	PARAMETER_NOTE	= "note";
	
	/**
	 * Constructor #1.<br />
	 * @param note
	 *        the note to set.
	 * @throws IllegalArgumentException
	 *         if the is outside the range [1;5].
	 */
	public Note (final Integer note) {
		super(PARAMETER_NOTE, note);
		if (note < NOTE_MIN) {
			throw new IllegalArgumentException("The note must be over " + NOTE_MIN);
		}
		if (note > NOTE_MAX) {
			throw new IllegalArgumentException("The note must be below " + NOTE_MAX);
		}
	}
	
}
