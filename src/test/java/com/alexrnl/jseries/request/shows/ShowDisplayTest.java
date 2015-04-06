package com.alexrnl.jseries.request.shows;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Ids;
import com.alexrnl.jseries.request.parameters.TheTVDBIds;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link ShowDisplay} class.
 * @author Alex
 */
public class ShowDisplayTest {
	/** Show display request */
	private ShowDisplay	showDisplay;
	/** Show display request with theTVDB id */
	private ShowDisplay	showDisplayTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showDisplay = new ShowDisplay(8, 4);
		showDisplayTVDB = new ShowDisplay(true, 28, 1);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, showDisplay.getVerb());
		assertEquals(Verb.GET, showDisplayTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/display", showDisplay.getMethod());
		assertEquals("/shows/display", showDisplayTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Ids(8, 4))), showDisplay.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new TheTVDBIds(28, 1))), showDisplayTVDB.getParameters());
	}
}
