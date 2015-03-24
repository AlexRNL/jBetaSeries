package com.alexrnl.jseries.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.alexrnl.commons.utils.object.ReflectUtils;

/**
 * Test suite for the {@link Format} class.
 * @author Alex
 */
public class FormatTest {
	
	/**
	 * Test method for {@link Format#getDescription()}.
	 */
	@Test
	public void testGetDescription () {
		assertEquals("text/xml", Format.XML.getDescription());
		assertEquals("application/json", Format.JSON.getDescription());
	}
	
	/**
	 * Trigger a full enum coverage on the {@link Format} enum.
	 */
	@Test
	public void fullStateEnumCoverage () {
		ReflectUtils.fullEnumCoverage(Format.class);
	}
}
