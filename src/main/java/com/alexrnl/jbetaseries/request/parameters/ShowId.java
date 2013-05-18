package com.alexrnl.jbetaseries.request.parameters;

/**
 * Parameter which allow to set the id of the show.<br />
 * @author Alex
 */
public class ShowId extends Parameter<Integer> {
	/** Name of the id parameter */
	public static final String	PARAMETER_SHOW_ID	= "showId";
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show.
	 */
	public ShowId (final Integer showId) {
		super(PARAMETER_SHOW_ID, showId);
	}
}
