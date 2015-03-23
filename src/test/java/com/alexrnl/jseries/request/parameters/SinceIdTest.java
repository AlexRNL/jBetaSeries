package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link SinceId} class.
 * @author Alex
 */
public class SinceIdTest {
	/** The since id to test */
	private SinceId	sinceId;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		sinceId = new SinceId(88);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("since_id", sinceId.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(88), sinceId.getValue());
	}
}
