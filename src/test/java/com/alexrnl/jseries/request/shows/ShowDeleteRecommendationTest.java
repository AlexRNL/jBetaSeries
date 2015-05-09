package com.alexrnl.jseries.request.shows;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link ShowDeleteRecommendation} class.
 * @author Alex
 */
public class ShowDeleteRecommendationTest {
	/** Show delete recommendation request */
	private ShowDeleteRecommendation	showDeleteRecommendation;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showDeleteRecommendation = new ShowDeleteRecommendation(8);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.DELETE, showDeleteRecommendation.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/recommendation", showDeleteRecommendation.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8))), showDeleteRecommendation.getParameters());
	}
	
}
