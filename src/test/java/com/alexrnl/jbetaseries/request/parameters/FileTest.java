package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link File} class.
 * @author Alex
 */
public class FileTest {
	/** File parameter to test */
	private File	file;
	/** Empty file */
	private File	emptyFile;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		file = new File("ldr.srt");
		emptyFile = new File("");
	}
	
	/**
	 * Test method for {@link com.alexrnl.jbetaseries.request.parameters.Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("file", file.getName());
		assertEquals("file", emptyFile.getName());
	}
	
	/**
	 * Test method for {@link com.alexrnl.jbetaseries.request.parameters.Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("ldr.srt", file.getValue());
		assertEquals("", emptyFile.getValue());
	}
}
