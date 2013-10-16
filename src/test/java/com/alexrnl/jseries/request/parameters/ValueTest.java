package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Value} class.
 * @author Alex
 */
public class ValueTest {
	/** The value to test */
	private Value	value;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		value = new Value("ldr_aba");
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("value", value.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("ldr_aba", value.getValue());
	}
}
