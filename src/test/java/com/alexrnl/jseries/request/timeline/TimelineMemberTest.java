package com.alexrnl.jseries.request.timeline;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.NumberEventsPerPage;
import com.alexrnl.jseries.request.parameters.SinceId;
import com.alexrnl.jseries.request.parameters.Types;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link TimelineMember} class.
 * @author Alex
 */
public class TimelineMemberTest {
	/** Timeline friends request */
	private TimelineMember	timelineMember;
	/** Timeline friends request with type specified */
	private TimelineMember	timelineMemberPerType;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		timelineMember = new TimelineMember(8, 25);
		timelineMemberPerType = new TimelineMember(4, 50, 128, "movies", "show");
	}
	
	/**
	 * Test that a <code>null</code> types array works.
	 */
	@Test
	public void testNullTypes () {
		final TimelineMember request = new TimelineMember(1, 28, 48, (String []) null);
		assertEquals(Arrays.asList(new Version(), new Id(1), new NumberEventsPerPage(28), new SinceId(48)), request.getParameters());
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, timelineMember.getVerb());
		assertEquals(Verb.GET, timelineMemberPerType.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/timeline/member", timelineMember.getMethod());
		assertEquals("/timeline/member", timelineMemberPerType.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(Arrays.asList(new Version(), new Id(8), new NumberEventsPerPage(25)), timelineMember.getParameters());
		assertEquals(Arrays.asList(new Version(), new Id(4), new NumberEventsPerPage(50), new SinceId(128), new Types("movies", "show")), timelineMemberPerType.getParameters());
	}
}
