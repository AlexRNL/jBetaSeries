package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test suite for the {@link BSBoolean} class.
 * @author Alex
 */
public class BSBooleanTest {
	
	/**
	 * Test method for {@link BSBoolean#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("yes", BSBoolean.TRUE.getValue());
		assertEquals("no", BSBoolean.FALSE.getValue());
	}
	
	/**
	 * Test method for {@link BSBoolean#toString()}.
	 */
	@Test
	public void testToString () {
		assertEquals("yes", BSBoolean.TRUE.toString());
		assertEquals("no", BSBoolean.FALSE.toString());
	}
	
	/**
	 * Test method for {@link BSBoolean#fromValue(String)}.
	 */
	@Test
	public void testFromValueString () {
		assertEquals(BSBoolean.TRUE, BSBoolean.fromValue("yes"));
		assertEquals(BSBoolean.FALSE, BSBoolean.fromValue("no"));
	}
	
	/**
	 * Test method for {@link BSBoolean#fromValue(String)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFromValueStringIllegalArgument () {
		assertEquals(BSBoolean.TRUE, BSBoolean.fromValue("aba"));
	}
	
	/**
	 * Test method for {@link BSBoolean#fromValue(boolean)}.
	 */
	@Test
	public void testFromValueBoolean () {
		assertEquals(BSBoolean.TRUE, BSBoolean.fromValue(true));
		assertEquals(BSBoolean.FALSE, BSBoolean.fromValue(false));
	}
}
