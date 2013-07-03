package com.alexrnl.jbetaseries.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test suite for the {@link Format} class.
 * @author Alex
 */
public class FormatTest {
	
	/**
	 * Test method for {@link com.alexrnl.jbetaseries.request.Format#getDescription()}.
	 */
	@Test
	public void testGetDescription () {
		assertEquals("text/xml", Format.XML.getDescription());
		assertEquals("application/json", Format.JSON.getDescription());
	}
}
