package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which allow to set the number of items to retrieve.<br />
 * @author Alex
 */
public class Nb extends Parameter<Integer> {
	/** The name of the nb parameter */
	public static final String	PARAMETER_NB	= "nb";
	
	/**
	 * Constructor #1.<br />
	 * @param nb
	 *        the number of items to set.
	 */
	public Nb (final Integer nb) {
		super(PARAMETER_NB, nb);
	}
	
}
