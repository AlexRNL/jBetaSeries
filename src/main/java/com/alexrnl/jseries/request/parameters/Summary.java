package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which allow to set the summary flag.<br />
 * @author Alex
 */
public class Summary extends Parameter<Boolean> {
	/** The name of the summary parameter */
	public static final String	PARAMETER_SUMMARY	= "summary";
	
	/**
	 * Constructor #1.<br />
	 * @param summary
	 *        the summary flag.
	 */
	public Summary (final Boolean summary) {
		super(PARAMETER_SUMMARY, summary);
	}
	
}
