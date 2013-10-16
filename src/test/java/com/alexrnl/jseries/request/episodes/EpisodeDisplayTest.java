package com.alexrnl.jseries.request.episodes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Ids;
import com.alexrnl.jseries.request.parameters.Parameter;
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
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episodeDisplay = new EpisodeDisplay(8);
		multiEpisodeDisplay = new EpisodeDisplay(2, 3);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, episodeDisplay.getVerb());
		assertEquals(Verb.GET, multiEpisodeDisplay.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/display", episodeDisplay.getMethod());
		assertEquals("/episodes/display", multiEpisodeDisplay.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(Arrays.asList(new Parameter<?>[] {new Version(), new Ids(8)}), episodeDisplay.getParameters());
		assertEquals(Arrays.asList(new Parameter<?>[] {new Version(), new Ids(2, 3)}), multiEpisodeDisplay.getParameters());
	}
	
	/**
	 * Check that no parameter can be added to the request.
	 */
	@Test(expected = UnsupportedOperationException.class)
	public void testModificationParameter () {
		episodeDisplay.getParameters().add(null);
	}
}
