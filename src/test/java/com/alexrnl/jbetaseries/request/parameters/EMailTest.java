package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link EMail} class.
 * @author Alex
 */
public class EMailTest {
	/** Email parameter */
	private EMail email;
	/** Empty email parameter */
	private EMail emptyEmail;
	
	/**
	 * Set up test attribute.
	 */
	@Before
	public void setUp () {
		email = new EMail("ldr@aba.fr");
		emptyEmail = new EMail("");
	}
	
	/**
	 * Test method for {@link com.alexrnl.jbetaseries.request.parameters.Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("email", email.getName());
		assertEquals("email", emptyEmail.getName());
	}
	
	/**
	 * Test method for {@link com.alexrnl.jbetaseries.request.parameters.Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("ldr@aba.fr", email.getValue());
		assertEquals("", emptyEmail.getValue());
	}
}
