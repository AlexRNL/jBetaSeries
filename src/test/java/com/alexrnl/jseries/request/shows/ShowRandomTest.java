package com.alexrnl.jseries.request.shows;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Nb;
import com.alexrnl.jseries.request.parameters.Summary;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link ShowRandom} class.
 * @author Alex
 */
public class ShowRandomTest {
	/** Show random default request */
	private ShowRandom	showRandom;
	/** Show random request for multiple shows */
	private ShowRandom	showRandomMultiple;
	/** Show random request with only a summary */
	private ShowRandom	showRandomSummary;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showRandom = new ShowRandom();
		showRandomMultiple = new ShowRandom(4);
		showRandomSummary = new ShowRandom(true);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, showRandom.getVerb());
		assertEquals(Verb.GET, showRandomMultiple.getVerb());
		assertEquals(Verb.GET, showRandomSummary.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/random", showRandom.getMethod());
		assertEquals("/shows/random", showRandomMultiple.getMethod());
		assertEquals("/shows/random", showRandomSummary.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version())), showRandom.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Nb(4))), showRandomMultiple.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Summary(true))), showRandomSummary.getParameters());
	}
}
