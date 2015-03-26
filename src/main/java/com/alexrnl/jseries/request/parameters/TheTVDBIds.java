package com.alexrnl.jseries.request.parameters;

import com.alexrnl.commons.utils.StringUtils;

/**
 * Parameter which allow to set several theTVDB of shows.<br />
 * @author Alex
 */
public class TheTVDBIds extends Parameter<String> {
	
	/**
	 * Constructor #1.<br />
	 * @param theTvdbId
	 *        the ids of the show.
	 */
	public TheTVDBIds (final Integer... theTvdbId) {
		super(TheTVDBId.PARAMETER_THE_TVDB_ID, StringUtils.separateWith(PARAMETER_VALUES_SEPARATOR, (Object[]) theTvdbId));
	}
	
}
