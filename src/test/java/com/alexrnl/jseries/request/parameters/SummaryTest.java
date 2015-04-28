package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Summary} class.
 * @author Alex
 */
public class SummaryTest {
	/** The with summary flag */
	private Summary	withSummary;
	/** The no summary flag */
	private Summary	noSummary;
	
	/**
	 * Set up test attribute.
	 */
	@Before
	public void setUp () {
		withSummary = new Summary(true);
		noSummary = new Summary(false);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("summary", withSummary.getName());
		assertEquals("summary", noSummary.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertTrue(withSummary.getValue());
		assertFalse(noSummary.getValue());
	}
}
