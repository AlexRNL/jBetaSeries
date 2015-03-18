package com.alexrnl.jseries.request.episodes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Ids;
import com.alexrnl.jseries.request.parameters.Subtitles;
import com.alexrnl.jseries.request.parameters.TheTVDBIds;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link EpisodeDisplay} class.
 * @author Alex
 */
public class EpisodeDisplayTest {
	/** The basic request to test */
	private EpisodeDisplay	episodeDisplay;
	/** The request with multiple episode to test */
	private EpisodeDisplay	multiEpisodeDisplay;
	/** The request with subtitles in episode to test */
	private EpisodeDisplay	episodeDisplayWithSubtitles;
	/** The request with theTVDB ids to test */
	private EpisodeDisplay	episodeDisplayTheTvdb;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episodeDisplay = new EpisodeDisplay(8);
		multiEpisodeDisplay = new EpisodeDisplay(2, 3);
		episodeDisplayWithSubtitles = new EpisodeDisplay(true, false, 14, 88);
		episodeDisplayTheTvdb = new EpisodeDisplay(false, true, 4, 8);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, episodeDisplay.getVerb());
		assertEquals(Verb.GET, multiEpisodeDisplay.getVerb());
		assertEquals(Verb.GET, episodeDisplayWithSubtitles.getVerb());
		assertEquals(Verb.GET, episodeDisplayTheTvdb.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/display", episodeDisplay.getMethod());
		assertEquals("/episodes/display", multiEpisodeDisplay.getMethod());
		assertEquals("/episodes/display", episodeDisplayWithSubtitles.getMethod());
		assertEquals("/episodes/display", episodeDisplayTheTvdb.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(Arrays.asList(new Version(), new Ids(8)), episodeDisplay.getParameters());
		assertEquals(Arrays.asList(new Version(), new Ids(2, 3)), multiEpisodeDisplay.getParameters());
		assertEquals(Arrays.asList(new Version(), new Subtitles(), new Ids(14, 88)), episodeDisplayWithSubtitles.getParameters());
		assertEquals(Arrays.asList(new Version(), new TheTVDBIds(4, 8)), episodeDisplayTheTvdb.getParameters());
	}
	
	/**
	 * Check that no parameter can be added to the request.
	 */
	@Test(expected = UnsupportedOperationException.class)
	public void testModificationParameter () {
		episodeDisplay.getParameters().add(null);
	}
	
}
