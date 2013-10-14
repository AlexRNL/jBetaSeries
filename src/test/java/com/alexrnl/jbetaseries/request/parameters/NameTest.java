package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Name} class.
 * @author Alex
 */
public class NameTest {
	/** The name to test */
	private Name name;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		name = new Name("LADBRA");
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("name", name.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("LADBRA", name.getValue());
	}
}
