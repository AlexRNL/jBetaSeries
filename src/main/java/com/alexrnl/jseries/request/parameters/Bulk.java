package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which specified to mark episode as seen in bulk or not.<br />
 * @author Alex
 */
public class Bulk extends Parameter<Boolean> {
	/** The name of the bulk parameter */
	private static final String	PARAMETER_BULK	= "bulk";
	
	/**
	 * Constructor #1.<br />
	 * @param bulk
	 *        <code>true</code> if the episode should be marked as seen in bulk.
	 */
	public Bulk (final Boolean bulk) {
		super(PARAMETER_BULK, bulk);
	}
	
	/**
	 * Constructor #2.<br />
	 * Default constructor.
	 */
	public Bulk () {
		this(null);
	}
}
