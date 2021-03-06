package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which allow to set the episode number.<br />
 * @author Alex
 */
public class Episode extends Parameter<Integer> {
	/** Name of the episode parameter */
	public static final String	PARAMETER_EPISODE	= "episode";
	
	/**
	 * Constructor #1.<br />
	 * @param episode
	 *        the number of the episode.
	 */
	public Episode (final Integer episode) {
		super(PARAMETER_EPISODE, episode);
	}
}
