package com.alexrnl.jseries.request.episodes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Ids;
import com.alexrnl.jseries.request.parameters.TheTVDBIds;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link EpisodeNext} class.
 * @author Alex
 */
public class EpisodeNextTest {
	/** Episode next request */
	private EpisodeNext	episodeNext;
	/** Episode next request with theTVDB id */
	private EpisodeNext	episodeNextTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episodeNext = new EpisodeNext(1, 5);
		episodeNextTVDB = new EpisodeNext(true, 4);
	}
	
	/**
	 * Test that a <code>null</code> ids array is handled.
	 */
	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void testNullIds () {
		new EpisodeNext((Integer []) null);
	}
	
	/**
	 * Test that an empty ids array is handled.
	 */
	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyIds () {
		new EpisodeNext();
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, episodeNext.getVerb());
		assertEquals(Verb.GET, episodeNextTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/next", episodeNext.getMethod());
		assertEquals("/episodes/next", episodeNextTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(Arrays.asList(new Version(), new Ids(1, 5)), episodeNext.getParameters());
		assertEquals(Arrays.asList(new Version(), new TheTVDBIds(4)), episodeNextTVDB.getParameters());
	}
	
}
