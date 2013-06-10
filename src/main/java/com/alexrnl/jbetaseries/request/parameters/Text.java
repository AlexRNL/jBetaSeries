package com.alexrnl.jbetaseries.request.parameters;


/**
 * Parameter which allow to set a text to sent to the API.<br />
 * @author Alex
 */
public class Text extends Parameter<String> {
	/** Name of the parameter text */
	public static final String	PARAMETER_TEXT	= "text";
	
	/**
	 * Constructor #1.<br />
	 * @param text
	 *        the text to sent to the API.
	 */
	public Text (final String text) {
		super(PARAMETER_TEXT, text);
	}
	
}
