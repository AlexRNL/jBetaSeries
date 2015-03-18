package com.alexrnl.jseries.request.parameters;

import com.alexrnl.commons.utils.StringUtils;

/**
 * Parameter which allow to set several theTVDB of shows.<br />
 * @author Alex
 */
public class TheTVDBIds extends Parameter<String> {
	/** Name of the id parameter */
	public static final String	PARAMETER_THE_TVDB_ID	= "thetvdb_id";
	
	/**
	 * Constructor #1.<br />
	 * @param theTvdbId
	 *        the id of the show.
	 */
	public TheTVDBIds (final Integer... theTvdbId) {
		super(PARAMETER_THE_TVDB_ID, StringUtils.separateWith(",", (Object[]) theTvdbId));
	}
	
}
