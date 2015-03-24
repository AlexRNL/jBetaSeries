package com.alexrnl.jseries.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.services.Configuration.ConfigurationBuilder;

/**
 * Test suite for the {@link Configuration} class.
 * @author Alex
 */
public class ConfigurationTest {
	/** The configuration to test */
	private Configuration	config;
	/** The default configuration to test */
	private Configuration	defaultConfig;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		config = new ConfigurationBuilder("AABBCC").setFormat(Format.XML).setUserAgent("unit-test").setCharset(StandardCharsets.ISO_8859_1).setSecure(false).create();
		defaultConfig = new ConfigurationBuilder("XXXYYY").create();
	}
	
	/**
	 * Test method for {@link Configuration#getKey()}.
	 */
	@Test
	public void testGetKey () {
		assertEquals("AABBCC", config.getKey());
		assertEquals("XXXYYY", defaultConfig.getKey());
	}
	
	/**
	 * Test method for {@link Configuration#getFormat()}.
	 */
	@Test
	public void testGetFormat () {
		assertEquals(Format.XML, config.getFormat());
		assertEquals(Format.JSON, defaultConfig.getFormat());
	}
	
	/**
	 * Test method for {@link Configuration#getUserAgent()}.
	 */
	@Test
	public void testGetUserAgent () {
		assertEquals("unit-test", config.getUserAgent());
		assertEquals("jSeries", defaultConfig.getUserAgent());
	}
	
	/**
	 * Test method for {@link Configuration#getCharset()}.
	 */
	@Test
	public void testGetCharset () {
		assertEquals(StandardCharsets.ISO_8859_1, config.getCharset());
		assertEquals(StandardCharsets.UTF_8, defaultConfig.getCharset());
	}
	
	/**
	 * Test method for {@link Configuration#isSecure()}.
	 */
	@Test
	public void testIsSecure () {
		assertFalse(config.isSecure());
		assertTrue(defaultConfig.isSecure());
	}
}
