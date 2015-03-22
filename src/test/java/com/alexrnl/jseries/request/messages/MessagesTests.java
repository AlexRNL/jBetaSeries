package com.alexrnl.jseries.request.messages;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite for the messages package.
 * @author Alex
 */
@RunWith(Suite.class)
@SuiteClasses({ MessageDiscussionTest.class, MessageInboxTest.class, MessagePostMessageTest.class,
		MessageDeleteMessageTest.class })
public class MessagesTests {
	
}
