package com.alexrnl.jseries.request.shows;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link ShowRecommendations} class.
 * @author Alex
 */
public class ShowRecommendationsTest {
	/** Show recommendations request */
	private ShowRecommendations	showRecommendations;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showRecommendations = new ShowRecommendations();
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, showRecommendations.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/recommendations", showRecommendations.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version())), showRecommendations.getParameters());
	}
}
