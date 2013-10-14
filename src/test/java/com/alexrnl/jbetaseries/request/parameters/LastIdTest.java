package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link LastId} class.
 * @author Alex
 */
public class LastIdTest {
	/** The last id to test */
	private LastId	lastId;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		lastId = new LastId(8);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("last_id", lastId.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(8), lastId.getValue());
	}
}
