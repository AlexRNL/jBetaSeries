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
 * Test suite for the {@link EpisodeUngrade} class.
 * @author Alex
 */
public class EpisodeUngradeTest {
	/** Episode un-grade request */
	private EpisodeUngrade	episodeUngrade;
	/** Episode un-grade request with theTVDB id */
	private EpisodeUngrade	episodeUngradeTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episodeUngrade = new EpisodeUngrade(false, 8);
		episodeUngradeTVDB = new EpisodeUngrade(true, 28);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.DELETE, episodeUngrade.getVerb());
		assertEquals(Verb.DELETE, episodeUngradeTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/note", episodeUngrade.getMethod());
		assertEquals("/episodes/note", episodeUngradeTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(Arrays.asList(new Version(), new Id(8)), episodeUngrade.getParameters());
		assertEquals(Arrays.asList(new Version(), new TheTVDBId(28)), episodeUngradeTVDB.getParameters());
	}
	
}
