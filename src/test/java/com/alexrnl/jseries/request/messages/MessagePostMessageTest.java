package com.alexrnl.jseries.request.messages;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Text;
import com.alexrnl.jseries.request.parameters.Title;
import com.alexrnl.jseries.request.parameters.To;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link MessagePostMessage} class.
 * @author Alex
 */
public class MessagePostMessageTest {
	/** Message post request for a new discussion */
	private MessagePostMessage	messageNewDiscussion;
	/** Message post request for a reply */
	private MessagePostMessage	messageReply;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		messageNewDiscussion = new MessagePostMessage(28, "Friends", "Hey, how'you doin'?");
		messageReply = new MessagePostMessage(8, "I'm fine, how are you?");
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.POST, messageNewDiscussion.getVerb());
		assertEquals(Verb.POST, messageReply.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/messages/message", messageNewDiscussion.getMethod());
		assertEquals("/messages/message", messageReply.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new To(28), new Title("Friends"), new Text("Hey, how'you doin'?"))), messageNewDiscussion.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Text("I'm fine, how are you?"), new Id(8))), messageReply.getParameters());
	}
}
