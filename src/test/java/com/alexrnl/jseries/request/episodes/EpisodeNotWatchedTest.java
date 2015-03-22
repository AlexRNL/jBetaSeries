package com.alexrnl.jseries.request.episodes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.TheTVDBId;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link EpisodeNotWatched} class.
 * @author Alex
 */
public class EpisodeNotWatchedTest {
	/** The episode not watched request to test */
	private EpisodeNotWatched	episodeNotWatched;
	/** The episode not watched request to test with theTVDB id */
	private EpisodeNotWatched	episodeNotWatchedTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episodeNotWatched = new EpisodeNotWatched(false, 8);
		episodeNotWatchedTVDB = new EpisodeNotWatched(true, 88);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.DELETE, episodeNotWatched.getVerb());
		assertEquals(Verb.DELETE, episodeNotWatchedTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/watched", episodeNotWatched.getMethod());
		assertEquals("/episodes/watched", episodeNotWatchedTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(Arrays.asList(new Version(), new Id(8)), episodeNotWatched.getParameters());
		assertEquals(Arrays.asList(new Version(), new TheTVDBId(88)), episodeNotWatchedTVDB.getParameters());
	}
	
}
