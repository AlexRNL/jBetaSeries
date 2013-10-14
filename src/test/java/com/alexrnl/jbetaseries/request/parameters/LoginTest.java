package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Login} class.
 * @author Alex
 */
public class LoginTest {
	/** The login to test */
	private Login	login;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		login = new Login("LDR");
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("login", login.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("LDR", login.getValue());
	}
	
}
