package com.alexrnl.jseries.request.episodes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.NumberStr;
import com.alexrnl.jseries.request.parameters.ShowId;
import com.alexrnl.jseries.request.parameters.Subtitles;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link EpisodeSearch} class.
 * @author Alex
 */
public class EpisodeSearchTest {
	/** Episode search request */
	private EpisodeSearch	episodeSearch;
	/** Episode search request with a global number*/
	private EpisodeSearch	episodeSearchGlobal;
	/** Episode search request with subtitle */
	private EpisodeSearch	episodeSearchSubtitle;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episodeSearch = new EpisodeSearch(3315, "s04e11");
		episodeSearchGlobal = new EpisodeSearch(3315, 79);
		episodeSearchSubtitle = new EpisodeSearch(3315, "s04e11", true);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, episodeSearch.getVerb());
		assertEquals(Verb.GET, episodeSearchGlobal.getVerb());
		assertEquals(Verb.GET, episodeSearchSubtitle.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/search", episodeSearch.getMethod());
		assertEquals("/episodes/search", episodeSearchGlobal.getMethod());
		assertEquals("/episodes/search", episodeSearchSubtitle.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new ShowId(3315), new NumberStr("s04e11"))), episodeSearch.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new ShowId(3315), new NumberStr("79"))), episodeSearchGlobal.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new ShowId(3315), new NumberStr("s04e11"), new Subtitles())), episodeSearchSubtitle.getParameters());
	}
}
