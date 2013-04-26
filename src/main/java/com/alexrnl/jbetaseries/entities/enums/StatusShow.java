package com.alexrnl.jbetaseries.entities.enums;

/**
 * Enumeration for the status of the shows.<br />
 * FIXME check actual names
 * @author Alex
 */
public enum StatusShow {
	/** The show is still airing */
	CONTINUING ("continuing"),
	/** The show has ended */
	ENDED ("ended"),
	/** Undefined status */
	UNDEFINED ("undefined");
	
	/** Name of the status */
	private final String	name;
	
	/**
	 * Constructor #1.<br />
	 * Unique constructor for the enumeration.
	 * @param name
	 *        the name of the status.
	 */
	private StatusShow (final String name) {
		this.name = name;
	}
	
	/**
	 * Return the attribute name.
	 * @return the attribute name.
	 */
	public String getName () {
		return name;
	}
	
	/**
	 * Find the Genre matching the given name.
	 * @param name
	 *        the name of the genre to find.
	 * @return the genre matching the specified name.
	 */
	public static StatusShow fromValue (final String name) {
		for (final StatusShow status : StatusShow.values()) {
			if (status.getName().equals(name)) {
				return status;
			}
		}
		throw new IllegalArgumentException("No status matching name '" + name + "'");
	}
}
