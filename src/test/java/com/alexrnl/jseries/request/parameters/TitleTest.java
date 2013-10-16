package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Title} class.
 * @author Alex
 */
public class TitleTest {
	/** The title to test */
	private Title	title;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		title = new Title("breaking");
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("title", title.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("breaking", title.getValue());
	}
}
