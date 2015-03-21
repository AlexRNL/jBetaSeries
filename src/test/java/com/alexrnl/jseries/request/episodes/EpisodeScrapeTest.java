package com.alexrnl.jseries.request.episodes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.File;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link EpisodeScrape} class.
 * @author Alex
 */
public class EpisodeScrapeTest {
	/** Episode scrape request */
	private EpisodeScrape	episodeScrape;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episodeScrape = new EpisodeScrape("PersonOfInterest.s04e11.mp4");
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, episodeScrape.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/scraper", episodeScrape.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(Arrays.asList(new Version(), new File("PersonOfInterest.s04e11.mp4")), episodeScrape.getParameters());
	}
}
