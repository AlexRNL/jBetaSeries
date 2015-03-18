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
 * Test suite for the {@link EpisodeLatest} class.
 * @author Alex
 */
public class EpisodeLatestTest {
	/** Episode latest request */
	private EpisodeLatest	episodeLatest;
	/** Episode latest request with theTVDB id */
	private EpisodeLatest	episodeLatestTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episodeLatest = new EpisodeLatest(false, 1, 5);
		episodeLatestTVDB = new EpisodeLatest(true, 4);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, episodeLatest.getVerb());
		assertEquals(Verb.GET, episodeLatestTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/latest", episodeLatest.getMethod());
		assertEquals("/episodes/latest", episodeLatestTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(Arrays.asList(new Version(), new Ids(1, 5)), episodeLatest.getParameters());
		assertEquals(Arrays.asList(new Version(), new TheTVDBIds(4)), episodeLatestTVDB.getParameters());
	}
	
}
