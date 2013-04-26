package com.alexrnl.jbetaseries.entities.enums;

/**
 * Enumeration for the genres of the shows.<br />
 * FIXME check actual names
 * @author Alex
 */
public enum Genre {
	/** Action series */
	ACTION ("action"),
	/** Adventure series */
	ADVENTURE ("adventure"),
	/** Animated series */
	ANIMATION ("animation"),
	/** Comedies */
	COMEDY ("comedy"),
	/** Documentaries */
	DOCUMENTARIES ("documentaries"),
	/** Drama */
	DRAMA ("drama"),
	/** Fantasy */
	FANTASY ("fantasy"),
	/** Mini series */
	MINI_SERIES ("mini series"),
	/** Science-fiction series */
	SCIENCE_FICTION("science-fiction");
	
	/** Name of the genre */
	private final String	name;
	
	/**
	 * Constructor #1.<br />
	 * Unique constructor for the enumeration.
	 * @param name
	 *        the name of the genre.
	 */
	private Genre (final String name) {
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
	public static Genre fromValue (final String name) {
		for (final Genre genre : Genre.values()) {
			if (genre.getName().equals(name)) {
				return genre;
			}
		}
		throw new IllegalArgumentException("No genre matching name '" + name + "'");
	}
}
