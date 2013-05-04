package com.alexrnl.jbetaseries.request.parameters;

/**
 * Parameter which allow to set the id.<br />
 * @author Alex
 */
public class Id extends Parameter<Integer> {
	/** Name of the id parameter */
	public static final String	PARAMETER_ID	= "id";
	
	/**
	 * Constructor #1.<br />
	 * @param id
	 *        the id of the show.
	 */
	public Id (final Integer id) {
		super(PARAMETER_ID, id);
	}
}
