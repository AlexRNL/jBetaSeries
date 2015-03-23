package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which allow to set the last id of the event to get.<br />
 * @author Alex
 */
public class SinceId extends Parameter<Integer> {
	/** Name of the id parameter */
	public static final String	PARAMETER_SINCE_ID	= "since_id";
	
	/**
	 * Constructor #1.<br />
	 * @param id
	 *        the id of the last event to get.
	 */
	public SinceId (final Integer id) {
		super(PARAMETER_SINCE_ID, id);
	}
}
