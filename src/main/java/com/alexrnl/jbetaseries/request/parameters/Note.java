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
	 */
	public Note (final Integer note) {
		super(PARAMETER_NOTE, note);
	}
	
}
