package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Summary} class.
 * @author Alex
 */
public class SummaryTest {
	/** The summary from a boolean */
	private Summary	booleanSummary;
	/** The summary from a {@link BSBoolean} */
	private Summary	bsBooleanSummary;
	
	/**
	 * Set up test attribute.
	 */
	@Before
	public void setUp () {
		booleanSummary = new Summary(true);
		bsBooleanSummary = new Summary(BSBoolean.FALSE);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("summary", booleanSummary.getName());
		assertEquals("summary", bsBooleanSummary.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(BSBoolean.TRUE, booleanSummary.getValue());
		assertEquals(BSBoolean.FALSE, bsBooleanSummary.getValue());
	}
}
