package com.alexrnl.jbetaseries.request.parameters;

/**
 * Parameter which allow to set the note of a show or an episode.<br />
 * @author Alex
 */
public class Note extends Parameter<Integer> {
	/** Name of the note parameter */
	public static final String	PARAMETER_NOTE	= "note";
	/** The minimum note allowed by the API */
	public static final int		NOTE_MIN		= 1;
	/** The maximum note allowed by the API */
	public static final int		NOTE_MAX		= 5;
	
	/**
	 * Constructor #1.<br />
	 * @param note
	 *        the note to set.
	 * @throws IllegalArgumentException
	 *         if the not is outside the range [1;5].
	 */
	public Note (final Integer note) throws IllegalArgumentException {
		super(PARAMETER_NOTE, note);
		if (note < NOTE_MIN || note > NOTE_MAX) {
			throw new IllegalArgumentException("The note must be comprise between 1 and 5.");
		}
	}
	
}
