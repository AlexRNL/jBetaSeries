package com.alexrnl.jbetaseries.entities;

import java.util.NavigableSet;
import java.util.Set;
import java.util.logging.Logger;

import com.alexrnl.jbetaseries.entities.enums.Genre;
import com.alexrnl.jbetaseries.entities.enums.StatusShow;

/**
 * Class representing a show.<br />
 * @author Alex
 */
public class Show {
	/** Logger */
	private static Logger			lg	= Logger.getLogger(Show.class.getName());
	
	/** URL of the show (used as an id in BetaSeries) */
	private final String			url;
	/** Title of the show */
	private final String			title;
	/** Id of the show at <a href="http://thetvdb.com">theTVDB</a>. */
	private Integer					idTVDB;
	/** Description of the show */
	private String					description;
	/** The status of the show */
	private StatusShow				status;
	/** Genres of the show */
	private Set<Genre>				genres;
	/** The season of the show (which contain the episodes) */
	private NavigableSet<Season>	seasons;
	/** The note of the show */
	//TODO private Note					note;
	
	/**
	 * Constructor #1.<br />
	 * Default constructor.
	 */
	public Show () {
		this(null, null);
	}
	
	/**
	 * Constructor #2.<br />
	 * This constructor build the show based only on an URL and a title, which makes it useful for
	 * building from search results.
	 * @param url
	 *        the URL of the show.
	 * @param title
	 *        the title of the show.
	 */
	public Show (final String url, final String title) {
		this.url = url;
		this.title = title;
	}
}
