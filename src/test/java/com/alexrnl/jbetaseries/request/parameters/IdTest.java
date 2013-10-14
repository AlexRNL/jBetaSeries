package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Id} class.
 * @author Alex
 */
public class IdTest {
	/** The id to test */
	private Id idToTest;
	
	/**
	 * Set up test parameters.
	 */
	@Before
	public void setUp () {
		idToTest = new Id(2);
	}
	
	/**
	 * Test method for {@link com.alexrnl.jbetaseries.request.parameters.Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("id", idToTest.getName());
	}
	
	/**
	 * Test method for {@link com.alexrnl.jbetaseries.request.parameters.Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(2), idToTest.getValue());
	}
}
