package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Find} class.
 * @author Alex
 */
public class FindTest {
	/** The find parameter to test */
	private Find emailToFind;
	
	/**
	 * Set up test parameters.
	 */
	@Before
	public void setUp () {
		emailToFind = new Find("ldr@google.fr");
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("find", emailToFind.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("ldr@google.fr", emailToFind.getValue());
	}
}
