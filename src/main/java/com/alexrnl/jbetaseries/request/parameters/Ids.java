package com.alexrnl.jbetaseries.request.parameters;

import com.alexrnl.commons.utils.StringUtils;

/**
 * Parameter which allow to set several ids of shows.<br />
 * @author Alex
 */
public class ShowIds extends Parameter<String> {
	
	/**
	 * Constructor #1.<br />
	 * @param ids
	 *        the id of the show.
	 */
	public ShowIds (final Integer... ids) {
		super(Id.PARAMETER_ID, StringUtils.separateWith(",", (Object[]) ids));
	}
	
}
