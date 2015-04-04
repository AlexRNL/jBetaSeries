package com.alexrnl.jseries.request.messages;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Page;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link MessageInbox} class.
 * @author Alex
 */
public class MessageInboxTest {
	/** Message inbox request */
	private MessageInbox	messageInbox;
	/** Message inbox request with the default page */
	private MessageInbox	messageInboxDefaultPage;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		messageInbox = new MessageInbox(4);
		messageInboxDefaultPage = new MessageInbox();
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, messageInbox.getVerb());
		assertEquals(Verb.GET, messageInboxDefaultPage.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/messages/inbox", messageInbox.getMethod());
		assertEquals("/messages/inbox", messageInboxDefaultPage.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Page(4))), messageInbox.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version())), messageInboxDefaultPage.getParameters());
	}
}
