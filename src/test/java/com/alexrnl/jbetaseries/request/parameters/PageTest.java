package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Page} class.
 * @author Alex
 */
public class PageTest {
	/** The page to test */
	private Page	page;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		page = new Page(4);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("page", page.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(4), page.getValue());
	}
}
