package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Test suite for the {@link Bulk} class.
 * @author Alex
 */
public class BulkTest {
	
	/**
	 * Test method for {@link com.alexrnl.jbetaseries.request.parameters.Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("bulk", new Bulk().getName());
	}
	
	/**
	 * Test method for {@link com.alexrnl.jbetaseries.request.parameters.Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertNull(new Bulk().getValue());
	}
}
