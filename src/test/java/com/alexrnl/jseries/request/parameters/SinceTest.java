package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Since} class.
 * @author Alex
 */
public class SinceTest {
	/** The since to test */
	private Since since;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		since = new Since(8);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("since", since.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(8), since.getValue());
	}
}
