package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which specified to mark episode as seen in bulk.<br />
 * @author Alex
 */
public class Bulk extends Parameter<Object> {
	/** The name of the bulk parameter */
	private static final String	PARAMETER_BULK	= "bulk";
	
	/**
	 * Constructor #1.<br />
	 */
	public Bulk () {
		super(PARAMETER_BULK, null);
	}
}
