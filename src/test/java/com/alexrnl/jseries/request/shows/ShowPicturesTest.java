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
 * Test suite for the {@link ShowPictures} class.
 * @author Alex
 */
public class ShowPicturesTest {
	/** Show pictures request */
	private ShowPictures	showPictures;
	/** Show pictures request with theTVDB id */
	private ShowPictures	showPicturesTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showPictures = new ShowPictures(8);
		showPicturesTVDB = new ShowPictures(true, 28);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, showPictures.getVerb());
		assertEquals(Verb.GET, showPicturesTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/pictures", showPictures.getMethod());
		assertEquals("/shows/pictures", showPicturesTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8))), showPictures.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new TheTVDBId(28))), showPicturesTVDB.getParameters());
	}
}
