package com.alexrnl.jseries.request.timeline;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.NumberResultsPerPage;
import com.alexrnl.jseries.request.parameters.SinceId;
import com.alexrnl.jseries.request.parameters.Types;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link TimelineHome} class.
 * @author Alex
 */
public class TimelineHomeTest {
	/** Timeline friends request */
	private TimelineHome	timelineHome;
	/** Timeline friends request with type specified */
	private TimelineHome	timelineHomePerType;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		timelineHome = new TimelineHome(25);
		timelineHomePerType = new TimelineHome(50, 128, "movies", "show");
	}
	
	/**
	 * Test that a <code>null</code> types array works.
	 */
	@Test
	public void testNullTypes () {
		final TimelineHome request = new TimelineHome(28, 48, (String []) null);
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new NumberResultsPerPage(28), new SinceId(48))), request.getParameters());
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, timelineHome.getVerb());
		assertEquals(Verb.GET, timelineHomePerType.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/timeline/home", timelineHome.getMethod());
		assertEquals("/timeline/home", timelineHomePerType.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new NumberResultsPerPage(25))), timelineHome.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new NumberResultsPerPage(50), new SinceId(128), new Types("movies", "show"))), timelineHomePerType.getParameters());
	}
}
