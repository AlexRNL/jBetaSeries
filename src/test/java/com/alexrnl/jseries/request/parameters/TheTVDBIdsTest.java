package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link TheTVDBIds} class.
 * @author Alex
 */
public class TheTVDBIdsTest {
	/** The ids to test */
	private TheTVDBIds	idsToTest;
	/** A single id to test */
	private TheTVDBIds	singleId;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		idsToTest = new TheTVDBIds(1, 4, 8);
		singleId = new TheTVDBIds(28);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("thetvdb_id", idsToTest.getName());
		assertEquals("thetvdb_id", singleId.getName());
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
