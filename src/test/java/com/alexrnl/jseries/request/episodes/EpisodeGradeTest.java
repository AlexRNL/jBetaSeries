package com.alexrnl.jseries.request.episodes;

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
 * Test suite for the {@link EpisodeGrade} class.
 * @author Alex
 */
public class EpisodeGradeTest {
	/** Episode grade request */
	private EpisodeGrade	episodeGrade;
	/** Episode grade request with theTVDB id */
	private EpisodeGrade	episodeGradeTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episodeGrade = new EpisodeGrade(false, 8, 4);
		episodeGradeTVDB = new EpisodeGrade(true, 28, 1);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.POST, episodeGrade.getVerb());
		assertEquals(Verb.POST, episodeGradeTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/note", episodeGrade.getMethod());
		assertEquals("/episodes/note", episodeGradeTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8), new Note(4))), episodeGrade.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new TheTVDBId(28), new Note(1))), episodeGradeTVDB.getParameters());
	}
}
