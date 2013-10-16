package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which allow to set a limit on the number of episode to get.<br />
 * @author Alex
 */
public class Limit extends Parameter<Integer> {
	/** Name of the limit parameter */
	public static final String	PARAMETER_LIMIT	= "limit";
	
	/**
	 * Constructor #1.<br />
	 * @param limit
	 *        the limit of episode to display.
	 */
	public Limit (final Integer limit) {
		super(PARAMETER_LIMIT, limit);
	}
}
