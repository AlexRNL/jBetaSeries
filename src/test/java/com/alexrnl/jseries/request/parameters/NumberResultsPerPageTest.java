package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link NumberResultsPerPage} class.
 * @author Alex
 */
public class NumberResultsPerPageTest {
	/** The resultsPerPage to test */
	private NumberResultsPerPage	resultsPerPage;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		resultsPerPage = new NumberResultsPerPage(28);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("nbpp", resultsPerPage.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(28), resultsPerPage.getValue());
	}
	
	/**
	 * Test method for an invalid resultsPerPage (too low).
	 */
	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void testNumberResultsTooLow () {
		new NumberResultsPerPage(0);
	}
	
	/**
	 * Test method for an invalid resultsPerPage (too high).
	 */
	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void testNumberResultsTooHigh () {
		new NumberResultsPerPage(108);
	}
	
}
