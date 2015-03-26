package com.alexrnl.jseries.request.parameters;

import com.alexrnl.commons.utils.StringUtils;


/**
 * Parameter which allows to specify the kind of event to retrieve.
 * @author Alex
 */
public class Types extends Parameter<String> {
	/** Name of the types parameter */
	public static final String	PARAMETER_VALUE	= "types";
	
	/**
	 * Constructor #1.<br />
	 * @param types
	 *        the value to set.
	 */
	public Types (final String... types) {
		super(PARAMETER_VALUE, StringUtils.separateWith(PARAMETER_VALUES_SEPARATOR, (Object[]) types));
	}

}
