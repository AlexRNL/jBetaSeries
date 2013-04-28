package com.alexrnl.jbetaseries.request;

/**
 * Class with the string constant defining the addresses of the API methods.<br />
 * @author Alex
 */
public final class APIAddresses {
	
	/**
	 * Constructor #1.<br />
	 * Default private constructor.
	 */
	private APIAddresses () {
		super();
	}
	
	/** Address for archiving or unarchiving shows. */
	public static final String	SHOWS_ARCHIVE	= "/shows/archive";
	/** Address for displaying shows */
	public static final String	SHOWS_DISPLAY	= "/shows/display";
}
