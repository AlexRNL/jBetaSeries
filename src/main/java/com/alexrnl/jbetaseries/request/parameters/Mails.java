package com.alexrnl.jbetaseries.request.parameters;

import com.alexrnl.commons.utils.StringUtils;

/**
 * Parameter to set several emails.<br />
 * @author Alex
 */
public class Mails extends Parameter<String> {
	/** Name for the mails parameter */
	private static final String	PARAMETER_MAILS	= "mails";
	
	/**
	 * Constructor #1.<br />
	 * @param mails
	 *        the mails to check for.
	 */
	public Mails (final String... mails) {
		super(PARAMETER_MAILS, StringUtils.separateWith(",", (Object[]) mails));
	}
}
