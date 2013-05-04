package com.alexrnl.jbetaseries.request.parameters;

/**
 * Parameter which allow to set a title for a query in the available shows.<br />
 * @author Alex
 */
public class Title extends Parameter<String> {
	/** The name of the title parameter */
	public static final String	PARAMETER_TITLE	= "title";
	
	/**
	 * Constructor #1.<br />
	 * @param query
	 *        the string to search in the shows' titles.
	 */
	public Title (final String query) {
		super(PARAMETER_TITLE, query);
	}
	
}
