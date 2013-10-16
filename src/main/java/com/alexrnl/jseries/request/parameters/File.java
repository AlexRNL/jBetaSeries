package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which allow to set a file to scrape.<br />
 * @author Alex
 */
public class File extends Parameter<String> {
	/** The name of the file parameter */
	public static final String	PARAMETER_FILE	= "file";
	
	/**
	 * Constructor #1.<br />
	 * @param file
	 *        the file to scrape.
	 */
	public File (final String file) {
		super(PARAMETER_FILE, file);
	}
}
