package com.alexrnl.jbetaseries.request.parameters;

/**
 * Parameter which allow to set the season number.<br />
 * @author Alex
 */
public class Season extends Parameter<Integer> {
	/** Name of the season parameter */
	public static final String	PARAMETER_SEASON	= "season";
	
	/**
	 * Constructor #1.<br />
	 * @param season
	 *        the number of the season.
	 */
	public Season (final Integer season) {
		super(PARAMETER_SEASON, season);
	}
}
