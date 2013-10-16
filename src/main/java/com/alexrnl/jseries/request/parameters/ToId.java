package com.alexrnl.jseries.request.parameters;

/**
 * Parameter to specified a recipient.<br />
 * @author Alex
 */
public class ToId extends Parameter<Integer> {
	/** Name of the to parameter */
	public static final String	PARAMETER_TO	= "to";
	
	/**
	 * Constructor #1.<br />
	 * @param friendId
	 *        the id of the friend targeted.
	 */
	public ToId (final Integer friendId) {
		super(PARAMETER_TO, friendId);
	}
}
