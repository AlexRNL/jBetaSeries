package com.alexrnl.jseries.request.parameters;

import static com.alexrnl.jseries.request.APIConstants.PARAMETER_VALUES_SEPARATOR;

import com.alexrnl.commons.utils.StringUtils;

/**
 * Parameter which allow to set several ids of shows.<br />
 * @author Alex
 */
public class Ids extends Parameter<String> {
	
	/**
	 * Constructor #1.<br />
	 * @param ids
	 *        the ids of the show.
	 */
	public Ids (final Integer... ids) {
		super(Id.PARAMETER_ID, StringUtils.separateWith(PARAMETER_VALUES_SEPARATOR, (Object[]) ids));
	}
	
}
