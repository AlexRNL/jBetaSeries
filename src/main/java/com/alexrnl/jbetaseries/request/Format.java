package com.alexrnl.jbetaseries.request;

/**
 * Format available by the API.<br />
 * @author Alex
 */
public enum Format {
	/** JavaScript Object Notation format */
	JSON ("application/json"),
	/** Extensible Markup Language */
	XML ("text/xml");
	
	/** The description of the format. */
	private String	description;
	
	/**
	 * Constructor #1.<br />
	 * Unique constructor for the enumeration.
	 * @param description
	 *        the description of the format.
	 */
	private Format (final String description) {
		this.description = description;
	}
	
	/**
	 * Return the attribute description.
	 * @return the attribute description.
	 */
	public String getDescription () {
		return description;
	}
	
}
