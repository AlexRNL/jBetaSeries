package com.alexrnl.jseries.request.episodes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Parameter;
import com.alexrnl.jseries.request.parameters.TheTVDBId;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link EpisodeDownloaded} class.
 * @author Alex
 */
public class EpisodeDownloadedTest {
	/** Episode downloaded request */
	private EpisodeDownloaded	episodeDownloaded;
	/** Episode downloaded request with theTVDB id */
	private EpisodeDownloaded	episodeDownloadedTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episodeDownloaded = new EpisodeDownloaded(false, 8);
		episodeDownloadedTVDB = new EpisodeDownloaded(true, 28);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.POST, episodeDownloaded.getVerb());
		assertEquals(Verb.POST, episodeDownloadedTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/downloaded", episodeDownloaded.getMethod());
		assertEquals("/episodes/downloaded", episodeDownloadedTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(Arrays.asList(new Parameter<?>[] { new Version(), new Id(8) }), episodeDownloaded.getParameters());
		assertEquals(Arrays.asList(new Parameter<?>[] { new Version(), new TheTVDBId(28) }), episodeDownloadedTVDB.getParameters());
	}
}
