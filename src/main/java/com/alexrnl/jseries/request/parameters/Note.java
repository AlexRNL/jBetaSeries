package com.alexrnl.jseries.request.parameters;

import com.alexrnl.jseries.request.APIConstants;

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
	 *         if the not is outside the range [1;5].
	 */
	public Note (final Integer note) {
		super(PARAMETER_NOTE, note);
		if (note < APIConstants.NOTE_MIN || note > APIConstants.NOTE_MAX) {
			throw new IllegalArgumentException("The note must be comprise between 1 and 5.");
		}
	}
	
}
