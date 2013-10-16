package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Limit} class.
 * @author Alex
 */
public class LimitTest {
	/** The limit to test */
	private Limit	limit;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		limit = new Limit(4);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("limit", limit.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(4), limit.getValue());
	}
}
