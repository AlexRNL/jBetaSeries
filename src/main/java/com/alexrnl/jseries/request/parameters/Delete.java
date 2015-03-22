package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which specified to mark episode as not seen in bulk or not.<br />
 * @author Alex
 */
public class Delete extends Parameter<Boolean> {
	/** The name of the delete parameter */
	private static final String	PARAMETER_DELETE	= "delete";
	
	/**
	 * Constructor #1.<br />
	 * @param delete
	 *        <code>true</code> if the episode should be unmarked as seen in bulk.
	 */
	public Delete (final Boolean delete) {
		super(PARAMETER_DELETE, delete);
	}
	
	/**
	 * Constructor #2.<br />
	 * Default constructor.
	 */
	public Delete () {
		this(null);
	}
}
