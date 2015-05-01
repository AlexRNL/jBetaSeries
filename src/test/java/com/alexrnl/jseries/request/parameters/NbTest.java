package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Nb} class.
 * @author Alex
 */
public class NbTest {
	/** The nb to test */
	private Nb nb;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		nb = new Nb(8);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("nb", nb.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(8), nb.getValue());
	}
}
