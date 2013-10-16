package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link ShowId} class.
 * @author Alex
 */
public class ShowIdTest {
	/** The show id to test */
	private ShowId	showId;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showId = new ShowId(8);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("showId", showId.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(8), showId.getValue());
	}
}
