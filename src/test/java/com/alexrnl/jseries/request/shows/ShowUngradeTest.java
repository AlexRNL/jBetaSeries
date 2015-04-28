package com.alexrnl.jseries.request.shows;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.TheTVDBId;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link ShowUngrade} class.
 * @author Alex
 */
public class ShowUngradeTest {
	/** Show ungrade request */
	private ShowUngrade	showUngrade;
	/** Show ungrade request with theTVDB id */
	private ShowUngrade	showUngradeTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showUngrade = new ShowUngrade(8);
		showUngradeTVDB = new ShowUngrade(true, 28);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.DELETE, showUngrade.getVerb());
		assertEquals(Verb.DELETE, showUngradeTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/note", showUngrade.getMethod());
		assertEquals("/shows/note", showUngradeTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8))), showUngrade.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new TheTVDBId(28))), showUngradeTVDB.getParameters());
	}
}
