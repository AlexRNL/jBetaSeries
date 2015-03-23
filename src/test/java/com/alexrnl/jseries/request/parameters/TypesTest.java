package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Types} class.
 * @author Alex
 */
public class TypesTest {
	/** The types to test */
	private Types	types;
	/** A single type to test */
	private Types	singleType;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		types = new Types("movie", "show", "friend");
		singleType = new Types("image");
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("types", types.getName());
		assertEquals("types", singleType.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("movie,show,friend", types.getValue());
		assertEquals("image", singleType.getValue());
	}
}
