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
	 * Test method for {@link com.alexrnl.jbetaseries.request.parameters.Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals(emailToFind.getName(), "find");
	}
	
	/**
	 * Test method for {@link com.alexrnl.jbetaseries.request.parameters.Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(emailToFind.getValue(), "ldr@google.fr");
	}
}
