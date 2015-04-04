package com.alexrnl.jseries.request.messages;

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
 * Test suite for the {@link MessageDiscussion} class.
 * @author Alex
 */
public class MessageDiscussionTest {
	/** Message discussion request */
	private MessageDiscussion	messageDiscussion;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		messageDiscussion = new MessageDiscussion(4);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, messageDiscussion.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/messages/discussion", messageDiscussion.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(4))), messageDiscussion.getParameters());
	}
}
