package com.alexrnl.jbetaseries.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
}
