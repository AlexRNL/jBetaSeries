package com.alexrnl.jseries.request.messages;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link MessageRead} class.
 * @author Alex
 */
public class MessageReadTest {
	/** Message read request */
	private MessageRead	messageRead;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		messageRead = new MessageRead(4);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.POST, messageRead.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/messages/read", messageRead.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(Arrays.asList(new Version(), new Id(4)), messageRead.getParameters());
	}
}
