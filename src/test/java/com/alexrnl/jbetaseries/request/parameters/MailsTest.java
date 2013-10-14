package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Mails} class.
 * @author Alex
 */
public class MailsTest {
	/** The mails to tests */
	private Mails	mailsToTest;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		mailsToTest = new Mails("aba@google.fr");
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("mails[]", mailsToTest.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("aba@google.fr", mailsToTest.getValue());
	}
}
