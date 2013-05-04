package com.alexrnl.jbetaseries.request.parameters;

/**
 * Parameter which allow to set the last id of the notification to get.<br />
 * @author Alex
 */
public class LastId extends Parameter<Integer> {
	/** Name of the id parameter */
	public static final String	PARAMETER_LAST_ID	= "last_id";
	
	/**
	 * Constructor #1.<br />
	 * @param id
	 *        the id of the last notification to get.
	 */
	public LastId (final Integer id) {
		super(PARAMETER_LAST_ID, id);
	}
}
