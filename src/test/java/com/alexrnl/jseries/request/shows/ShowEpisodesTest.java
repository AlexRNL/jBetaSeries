package com.alexrnl.jseries.request.shows;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Episode;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Season;
import com.alexrnl.jseries.request.parameters.Subtitles;
import com.alexrnl.jseries.request.parameters.TheTVDBId;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link ShowEpisodes} class.
 * @author Alex
 */
public class ShowEpisodesTest {
	/** Show episodes request for the episodes of the whole show */
	private ShowEpisodes	showAllEpisodes;
	/** Show episode request for the episodes of a season */
	private ShowEpisodes	showEpisodesFromSeason;
	/** Show episode request for a single episode */
	private ShowEpisodes	showSingleEpisode;
	/** Show episode request for an episode with subtitle */
	private ShowEpisodes	showEpisodeTheTVDBWithSubtitles;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showAllEpisodes = new ShowEpisodes(8);
		showEpisodesFromSeason = new ShowEpisodes(8, 2);
		showSingleEpisode = new ShowEpisodes(4, 8, 14);
		showEpisodeTheTVDBWithSubtitles = new ShowEpisodes(true, 1, 8, 4, true);
	}
	
	/**
	 * Test that a request with an episode number but no season number is invalid.<br />
	 */
	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void testEpisodeWithoutSeasonRequest () {
		new ShowEpisodes(8, null, 28);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, showAllEpisodes.getVerb());
		assertEquals(Verb.GET, showEpisodesFromSeason.getVerb());
		assertEquals(Verb.GET, showSingleEpisode.getVerb());
		assertEquals(Verb.GET, showEpisodeTheTVDBWithSubtitles.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/episodes", showAllEpisodes.getMethod());
		assertEquals("/shows/episodes", showEpisodesFromSeason.getMethod());
		assertEquals("/shows/episodes", showSingleEpisode.getMethod());
		assertEquals("/shows/episodes", showEpisodeTheTVDBWithSubtitles.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8))), showAllEpisodes.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8), new Season(2))),
				showEpisodesFromSeason.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(4), new Season(8), new Episode(14))),
				showSingleEpisode.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new TheTVDBId(1), new Season(8), new Episode(4), new Subtitles())),
				showEpisodeTheTVDBWithSubtitles.getParameters());
	}
}
