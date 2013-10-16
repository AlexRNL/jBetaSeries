package com.alexrnl.jseries.request.parameters;


/**
 * Parameter to set an email.<br />
 * This parameter may be set multiple times.
 * @author Alex
 */
public class Mails extends Parameter<String> {
	/** Name for the mails parameter */
	private static final String	PARAMETER_MAILS	= "mails[]";
	
	/**
	 * Constructor #1.<br />
	 * @param mails
	 *        the mail to check for.
	 */
	public Mails (final String mails) {
		super(PARAMETER_MAILS, mails);
	}
}
