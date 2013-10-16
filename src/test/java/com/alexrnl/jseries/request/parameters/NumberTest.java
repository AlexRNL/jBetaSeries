package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Number} class.
 * @author Alex
 */
public class NumberTest {
	/** The number to test */
	private Number number;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		number = new Number(8);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("number", number.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(8), number.getValue());
	}
}
