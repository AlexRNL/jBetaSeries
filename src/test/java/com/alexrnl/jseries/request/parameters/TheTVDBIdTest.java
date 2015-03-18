package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link TheTVDBId} class.
 * @author Alex
 */
public class TheTVDBIdTest {
	/** The id to test */
	private TheTVDBId idToTest;
	
	/**
	 * Set up test parameters.
	 */
	@Before
	public void setUp () {
		idToTest = new TheTVDBId(2);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("thetvdb_id", idToTest.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(2), idToTest.getValue());
	}
}
