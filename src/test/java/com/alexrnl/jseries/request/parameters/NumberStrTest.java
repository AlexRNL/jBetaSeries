package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link NumberStr} class.
 * @author Alex
 */
public class NumberStrTest {
	/** The number to test */
	private NumberStr	number;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		number = new NumberStr("8");
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
		assertEquals("8", number.getValue());
	}
}
