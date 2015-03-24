package com.alexrnl.jseries.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.alexrnl.commons.utils.object.ReflectUtils;

/**
 * Test suite for the {@link Verb} class.
 * @author Alex
 */
public class VerbTest {
	
	/**
	 * Test method for {@link Verb#getHttpMethodName()}.
	 */
	@Test
	public void testGetHttpMethodName () {
		assertEquals("GET", Verb.GET.getHttpMethodName());
		assertEquals("POST", Verb.POST.getHttpMethodName());
		assertEquals("PUT", Verb.PUT.getHttpMethodName());
		assertEquals("DELETE", Verb.DELETE.getHttpMethodName());
	}
	
	/**
	 * Trigger a full enum coverage on the {@link Verb} enum.
	 */
	@Test
	public void fullStateEnumCoverage () {
		ReflectUtils.fullEnumCoverage(Verb.class);
	}
}
