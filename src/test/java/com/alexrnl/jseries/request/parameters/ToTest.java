package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link To} class.
 * @author Alex
 */
public class ToTest {
	/** The to attribute to test */
	private To	to;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		to = new To(25);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("to", to.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(25), to.getValue());
	}
}
