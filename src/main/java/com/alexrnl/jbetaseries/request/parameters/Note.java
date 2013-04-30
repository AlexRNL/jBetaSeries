package com.alexrnl.jbetaseries.request.parameters;

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
	public Note (final Integer note) throws IllegalArgumentException {
		super(PARAMETER_NOTE, note);
		if (note < 1 || 5 < note) {
			throw new IllegalArgumentException("The note must be comprise between 1 and 5.");
		}
	}
	
}
