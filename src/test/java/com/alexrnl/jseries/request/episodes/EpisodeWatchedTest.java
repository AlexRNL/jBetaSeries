package com.alexrnl.jseries.request.episodes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Bulk;
import com.alexrnl.jseries.request.parameters.Delete;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Note;
import com.alexrnl.jseries.request.parameters.TheTVDBId;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link EpisodeWatched} class.
 * @author Alex
 */
public class EpisodeWatchedTest {
	/** The basic request to test */
	private EpisodeWatched	episodeWatched;
	/** The request with multiple episode to test */
	private EpisodeWatched	episodeWatchedGraded;
	/** The request with subtitles in episode to test */
	private EpisodeWatched	episodeWatchedNotBulkNotDelete;
	/** The request with a theTVDB episode id */
	private EpisodeWatched	episodeWatchedTheTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episodeWatched = new EpisodeWatched(8);
		episodeWatchedGraded = new EpisodeWatched(8, 3);
		episodeWatchedNotBulkNotDelete = new EpisodeWatched(8, false, false, 3);
		episodeWatchedTheTVDB = new EpisodeWatched(true, 8, true, true, 3);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.POST, episodeWatched.getVerb());
		assertEquals(Verb.POST, episodeWatchedGraded.getVerb());
		assertEquals(Verb.POST, episodeWatchedNotBulkNotDelete.getVerb());
		assertEquals(Verb.POST, episodeWatchedTheTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/watched", episodeWatched.getMethod());
		assertEquals("/episodes/watched", episodeWatchedGraded.getMethod());
		assertEquals("/episodes/watched", episodeWatchedNotBulkNotDelete.getMethod());
		assertEquals("/episodes/watched", episodeWatchedTheTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8))), episodeWatched.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8), new Note(3))), episodeWatchedGraded.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8), new Bulk(false), new Delete(false), new Note(3))), episodeWatchedNotBulkNotDelete.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new TheTVDBId(8), new Bulk(true), new Delete(true), new Note(3))), episodeWatchedTheTVDB.getParameters());
	}
	
}
