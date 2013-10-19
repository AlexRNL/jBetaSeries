package com.alexrnl.jseries.request.episodes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Parameter;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link EpisodeNotDownloaded} class.
 * @author Alex
 */
public class EpisodeNotDownloadedTest {
	/** The episode not downloaded request to test */
	private EpisodeNotDownloaded	episodeNotDownloaded;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episodeNotDownloaded = new EpisodeNotDownloaded(8);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.DELETE, episodeNotDownloaded.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/downloaded", episodeNotDownloaded.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(Arrays.asList(new Parameter[] {new Version(), new Id(8)}), episodeNotDownloaded.getParameters());
	}
	
}
