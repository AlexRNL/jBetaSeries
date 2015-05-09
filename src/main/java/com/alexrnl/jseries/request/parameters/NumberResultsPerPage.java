package com.alexrnl.jseries.request.parameters;


/**
 * Parameter which allow to set the number of results per page.<br />
 * @author Alex
 */
public class NumberResultsPerPage extends Parameter<Integer> {
	/** The name of the number parameter */
	public static final String	PARAMETER_NUMBER_RESULTS_PER_PAGE	= "nbpp";
	/** The maximum number of results per page */
	public static final int		MAXIMUM_NUMBER_OF_RESULTS_PER_PAGE	= 100;
	
	/**
	 * Constructor #1.<br />
	 * @param resultsPerPage
	 *        the number of items to set.
	 * @throws IllegalArgumentException
	 *         if the number of results per page is negative, null or over
	 *         {@link #MAXIMUM_NUMBER_OF_RESULTS_PER_PAGE}.
	 */
	public NumberResultsPerPage (final Integer resultsPerPage) {
		super(PARAMETER_NUMBER_RESULTS_PER_PAGE, resultsPerPage);
		if (resultsPerPage <= 0) {
			throw new IllegalArgumentException("The number of results per page must be positive");
		}
		if (resultsPerPage > MAXIMUM_NUMBER_OF_RESULTS_PER_PAGE) {
			throw new IllegalArgumentException("The number of results per page must be lower than "
					+ MAXIMUM_NUMBER_OF_RESULTS_PER_PAGE);
		}
	}
	
}
