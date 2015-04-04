package com.alexrnl.jseries.request.timeline;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.NumberEventsPerPage;
import com.alexrnl.jseries.request.parameters.SinceId;
import com.alexrnl.jseries.request.parameters.Types;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link TimelineFriends} class.
 * @author Alex
 */
public class TimelineFriendsTest {
	/** Timeline friends request */
	private TimelineFriends	timelineFriends;
	/** Timeline friends request with type specified */
	private TimelineFriends	timelineFriendsPerType;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		timelineFriends = new TimelineFriends(25);
		timelineFriendsPerType = new TimelineFriends(50, 128, "movies", "show");
	}
	
	/**
	 * Test that a <code>null</code> types array works.
	 */
	@Test
	public void testNullTypes () {
		final TimelineFriends request = new TimelineFriends(28, 48, (String []) null);
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new NumberEventsPerPage(28), new SinceId(48))), request.getParameters());
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, timelineFriends.getVerb());
		assertEquals(Verb.GET, timelineFriendsPerType.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/timeline/friends", timelineFriends.getMethod());
		assertEquals("/timeline/friends", timelineFriendsPerType.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new NumberEventsPerPage(25))), timelineFriends.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new NumberEventsPerPage(50), new SinceId(128), new Types("movies", "show"))), timelineFriendsPerType.getParameters());
	}
}
