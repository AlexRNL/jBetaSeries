package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Password} class.
 * @author Alex
 */
public class PasswordTest {
	/** The password to test */
	private Password	password;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		password = new Password("AEFZRF134253");
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("password", password.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("AEFZRF134253", password.getValue());
	}
}
