package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link ToId} class.
 * @author Alex
 */
public class ToIdTest {
	/** The toId to test */
	private ToId	toId;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		toId = new ToId(28);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("to", toId.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(28), toId.getValue());
	}
}
