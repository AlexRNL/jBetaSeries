package com.alexrnl.jbetaseries.request.parameters;


/**
 * Parameter which allow to set the auto delete flag on notifications.<br />
 * @author Alex
 */
public class AutoDelete extends Parameter<BSBoolean> {
	/** The name of the auto delete parameter */
	private static final String	PARAMETER_AUTO_DELETE	= "auto_delete";

	/**
	 * Constructor #1.<br />
	 * @param autoDelete
	 *        <code>true</code> to automatically delete notifications.
	 */
	public AutoDelete (final BSBoolean autoDelete) {
		super(PARAMETER_AUTO_DELETE, autoDelete);
	}
	
	/**
	 * Constructor #2.<br />
	 * @param autoDelete
	 *        <code>true</code> to automatically delete notifications.
	 */
	public AutoDelete (final boolean autoDelete) {
		this(BSBoolean.fromValue(autoDelete));
	}
}
