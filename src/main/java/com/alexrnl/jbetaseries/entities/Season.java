package com.alexrnl.jbetaseries.entities;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

import com.alexrnl.commons.utils.object.AutoCompare;
import com.alexrnl.commons.utils.object.AutoHashCode;
import com.alexrnl.commons.utils.object.Field;

/**
 * Class representing a season of a show.<br />
 * @author Alex
 */
public class Season implements Comparable<Season> {
	/** The season number */
	private Integer					seasonNumber;
	/** The episodes of the season */
	private final NavigableSet<Episode>	episodes;
	
	/**
	 * Constructor #1.<br />
	 * Default constructor, build a season with the number 0.
	 */
	public Season () {
		this(0);
	}
	
	/**
	 * Constructor #2.<br />
	 * Build a season with the provided season number.
	 * @param seasonNumber
	 *        the number of the season.
	 */
	public Season (final Integer seasonNumber) {
		super();
		this.seasonNumber = seasonNumber;
		this.episodes = new TreeSet<>();
	}
	
	/**
	 * Return the attribute seasonNumber.
	 * @return the attribute seasonNumber.
	 */
	@Field
	public Integer getSeasonNumber () {
		return seasonNumber;
	}
	
	/**
	 * Set the attribute seasonNumber.
	 * @param seasonNumber
	 *        the attribute seasonNumber.
	 */
	public void setSeasonNumber (final Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
	}
	
	/**
	 * Return an read-only view of the episodes contained in the season.
	 * @return the episodes of the season.
	 */
	public SortedSet<Episode> getEpisodes () {
		return Collections.unmodifiableSortedSet(episodes);
	}
	
	/**
	 * Add an episode to the season.
	 * @param episode
	 *        the episode to add.
	 * @return <code>true</code> if the episode was added to the internal set (i.e. there was no
	 *         previous episode with that number).
	 */
	public boolean addEpisode (final Episode episode) {
		return episodes.add(episode);
	}
	
	/**
	 * Remove an episode from the season.
	 * @param episode
	 *        the episode to remove.
	 * @return <code>true</code> if the season contained the episode.
	 */
	public boolean removeEpisode (final Episode episode) {
		return episodes.remove(episode);
	}
	
	@Override
	public int compareTo (final Season s) {
		return seasonNumber.compareTo(s.getSeasonNumber());
	}
	
	@Override
	public int hashCode () {
		return AutoHashCode.getInstance().hashCode(this);
	}
	
	@Override
	public boolean equals (final Object obj) {
		if (!(obj instanceof Season)) {
			return false;
		}
		return AutoCompare.getInstance().compare(this, (Season) obj);
	}
	
}
