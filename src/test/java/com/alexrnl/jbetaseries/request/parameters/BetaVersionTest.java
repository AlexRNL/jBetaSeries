package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test suite for the {@link BetaVersion} class.
 * @author Alex
 */
public class BetaVersionTest {
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("v", new BetaVersion().getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("2.0", new BetaVersion().getValue());
	}
}
