package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test suite for the {@link Version} class.
 * @author Alex
 */
public class VersionTest {
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("v", new Version().getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("2.1", new Version().getValue());
	}
}
