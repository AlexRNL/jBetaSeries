package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which allow to set the number of the page to load.<br />
 * @author Alex
 */
public class Page extends Parameter<Integer> {
	/** The name of the parameter for the page */
	public static final String	PARAMETER_PAGE	= "page";
	
	/**
	 * Constructor #1.<br />
	 * @param pageNumber
	 *        the number of the page to load.
	 */
	public Page (final Integer pageNumber) {
		super(PARAMETER_PAGE, pageNumber);
	}
}
