package com.alexrnl.jseries.request.shows;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Note;
import com.alexrnl.jseries.request.parameters.TheTVDBId;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link ShowGrade} class.
 * @author Alex
 */
public class ShowGradeTest {
	/** Show grade request */
	private ShowGrade	showGrade;
	/** Show grade request with theTVDB id */
	private ShowGrade	showGradeTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showGrade = new ShowGrade(false, 8, 4);
		showGradeTVDB = new ShowGrade(true, 28, 1);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.POST, showGrade.getVerb());
		assertEquals(Verb.POST, showGradeTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/note", showGrade.getMethod());
		assertEquals("/shows/note", showGradeTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8), new Note(4))), showGrade.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new TheTVDBId(28), new Note(1))), showGradeTVDB.getParameters());
	}
}
