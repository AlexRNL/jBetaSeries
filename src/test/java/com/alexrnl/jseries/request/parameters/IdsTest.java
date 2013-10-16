package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Ids} class.
 * @author Alex
 */
public class IdsTest {
	/** The ids to test */
	private Ids	idsToTest;
	/** A single id to test */
	private Ids	singleId;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		idsToTest = new Ids(1, 4, 8);
		singleId = new Ids(28);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("id", idsToTest.getName());
		assertEquals("id", singleId.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("1,4,8", idsToTest.getValue());
		assertEquals("28", singleId.getValue());
	}
}
