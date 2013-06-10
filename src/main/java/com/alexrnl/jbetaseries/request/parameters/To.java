package com.alexrnl.jbetaseries.request.parameters;


/**
 * Parameter which allow to specify the target member of a message.<br />
 * @author Alex
 */
public class To extends Parameter<Integer> {
	/** Name of the parameter to */
	public static final String	PARAMETER_TO	= "to";
	
	/**
	 * Constructor #1.<br />
	 * @param to
	 *        the id of the target member.
	 */
	public To (final Integer to) {
		super(PARAMETER_TO, to);
	}
}
