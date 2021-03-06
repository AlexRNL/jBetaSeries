package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Season} class.
 * @author Alex
 */
public class SeasonTest {
	/** The season to test */
	private Season	season;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		season = new Season(2);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("season", season.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(2), season.getValue());
	}
}
