package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Delete} class.
 * @author Alex
 */
public class DeleteTest {
	/** The delete parameter which set the next episodes as unseen */
	private Delete delete;
	/** The delete parameter which does not change the state of next episodes */
	private Delete notDelete;
		
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		delete = new Delete();
		notDelete = new Delete(false);
	}
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("delete", delete.getName());
		assertEquals("delete", notDelete.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertNull(delete.getValue());
		assertFalse(notDelete.getValue());
	}
	
}
