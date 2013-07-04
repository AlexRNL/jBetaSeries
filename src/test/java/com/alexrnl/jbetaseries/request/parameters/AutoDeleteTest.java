package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

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
	 * Test method for {@link com.alexrnl.jbetaseries.request.parameters.Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("auto_delete", delete.getName());
		assertEquals("auto_delete", notDelete.getName());
	}
	
	/**
	 * Test method for {@link com.alexrnl.jbetaseries.request.parameters.Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(BSBoolean.TRUE, delete.getValue());
		assertEquals(BSBoolean.FALSE, notDelete.getValue());
	}
}
