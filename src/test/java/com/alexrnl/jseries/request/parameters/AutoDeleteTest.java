package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link AutoDelete} class.
 * @author Alex
 */
public class AutoDeleteTest {
	/** Parameter to delete data automatically */
	private AutoDelete	delete;
	/** Parameter to not delete data */
	private AutoDelete	notDelete;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		delete = new AutoDelete(true);
		notDelete = new AutoDelete(false);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("auto_delete", delete.getName());
		assertEquals("auto_delete", notDelete.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertTrue(delete.getValue());
		assertFalse(notDelete.getValue());
	}
}
