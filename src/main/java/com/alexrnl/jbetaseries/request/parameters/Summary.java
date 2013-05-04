package com.alexrnl.jbetaseries.request.parameters;

/**
 * Parameter which allow to set the summary flag.<br />
 * @author Alex
 */
public class Summary extends Parameter<BSBoolean> {
	/** The name of the summary parameter */
	public static final String	PARAMETER_SUMMARY	= "summary";
	
	/**
	 * Constructor #1.<br />
	 * @param summary
	 *        the summary flag.
	 */
	public Summary (final BSBoolean summary) {
		super(PARAMETER_SUMMARY, summary);
	}
	
	/**
	 * Constructor #2.<br />
	 * @param summary
	 *        the summary flag.
	 */
	public Summary (final boolean summary) {
		this(BSBoolean.fromValue(summary));
	}
}
