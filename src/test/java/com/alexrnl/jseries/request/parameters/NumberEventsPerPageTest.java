package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link NumberEventsPerPage} class.
 * @author Alex
 */
public class NumberEventsPerPageTest {
	/** The eventsPerPage to test */
	private NumberEventsPerPage	eventsPerPage;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		eventsPerPage = new NumberEventsPerPage(28);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("nbpp", eventsPerPage.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(28), eventsPerPage.getValue());
	}
	
	/**
	 * Test method for an invalid eventsPerPage (too low).
	 */
	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void testNumberEventsTooLow () {
		new NumberEventsPerPage(0);
	}
	
	/**
	 * Test method for an invalid eventsPerPage (too high).
	 */
	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void testNumberEventsTooHigh () {
		new NumberEventsPerPage(108);
	}
	
}
