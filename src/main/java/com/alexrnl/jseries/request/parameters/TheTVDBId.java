package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which allow to set the theTVDB id.<br />
 * @author Alex
 */
public class TheTVDBId extends Parameter<Integer> {
	/** Name of the id parameter */
	public static final String	PARAMETER_THE_TVDB_ID	= "thetvdb_id";
	
	/**
	 * Constructor #1.<br />
	 * @param id
	 *        the TVDB id of the show.
	 */
	public TheTVDBId (final Integer id) {
		super(PARAMETER_THE_TVDB_ID, id);
	}
}
