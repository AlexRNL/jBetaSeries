package com.alexrnl.jseries.services;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link DefaultHttpConnectionProvider} class.
 * @author Alex
 */
public class DefaultHttpConnectionProviderTest {
	/** The provider to test */
	private DefaultHttpConnectionProvider	provider;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		provider = new DefaultHttpConnectionProvider();
	}
	
	/**
	 * Test method for {@link DefaultHttpConnectionProvider#getHttpConnection(String)}.
	 * @throws IOException
	 *         if there is an IO error.
	 */
	@Test
	public void testGetHttpConnection () throws IOException {
		assertNotNull(provider.getHttpConnection("http://www.google.com"));
	}
	
	/**
	 * Test method for {@link DefaultHttpConnectionProvider#getHttpConnection(String)} with an
	 * invalid address.
	 * @throws IOException
	 *         if there is an IO error.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetHttpConnectionInvalidAddress () throws IOException {
		provider.getHttpConnection("hello.world");
	}
	
}
