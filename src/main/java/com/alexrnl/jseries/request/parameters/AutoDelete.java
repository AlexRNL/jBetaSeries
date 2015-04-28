package com.alexrnl.jseries.request.parameters;


/**
 * Parameter which allow to set the auto delete flag on notifications.<br />
 * @author Alex
 */
public class AutoDelete extends Parameter<Boolean> {
	/** The name of the auto delete parameter */
	private static final String	PARAMETER_AUTO_DELETE	= "auto_delete";

	/**
	 * Constructor #1.<br />
	 * @param autoDelete
	 *        <code>true</code> to automatically delete notifications.
	 */
	public AutoDelete (final Boolean autoDelete) {
		super(PARAMETER_AUTO_DELETE, autoDelete);
	}
	
}
