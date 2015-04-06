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
 * Test suite for the {@link ShowUnarchive} class.
 * @author Alex
 */
public class ShowUnarchiveTest {
	/** Show unarchive request */
	private ShowUnarchive	showArchive;
	/** Show unarchive request with theTVDB id */
	private ShowUnarchive	showArchiveTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showArchive = new ShowUnarchive(8);
		showArchiveTVDB = new ShowUnarchive(true, 28);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.DELETE, showArchive.getVerb());
		assertEquals(Verb.DELETE, showArchiveTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/archive", showArchive.getMethod());
		assertEquals("/shows/archive", showArchiveTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8))), showArchive.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new TheTVDBId(28))), showArchiveTVDB.getParameters());
	}
	
}
