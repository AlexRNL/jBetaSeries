package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Text} class.
 * @author Alex
 */
public class TextTest {
	/** The text to test */
	private Text	text;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		text = new Text("Ldr, hw, BrBa.");
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("text", text.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("Ldr, hw, BrBa.", text.getValue());
	}
}
