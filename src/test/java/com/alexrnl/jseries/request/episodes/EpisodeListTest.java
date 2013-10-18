package com.alexrnl.jseries.request.episodes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Limit;
import com.alexrnl.jseries.request.parameters.Parameter;
import com.alexrnl.jseries.request.parameters.ShowId;
import com.alexrnl.jseries.request.parameters.Subtitles;
import com.alexrnl.jseries.request.parameters.Subtitles.Filter;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link EpisodeList} class.
 * @author Alex
 */
public class EpisodeListTest {
	/** Full list request */
	private EpisodeList	fullRequest;
	/** Default list request */
	private EpisodeList	defaultRequest;
	/** Show episodes list request */
	private EpisodeList	showRequest;
	/** Episodes with subtitles list request */
	private EpisodeList	subtitleFilteredRequest;
	/** Limited number of show episode list request */
	private EpisodeList	limitedShowRequest;
	/** Show episode with subtitles list request */
	private EpisodeList	subtitleShowRequest;
	/** Limit number of episode with subtitles request */
	private EpisodeList	subtitleLimitRequest;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		fullRequest = new EpisodeList(28, 14, Filter.ALL);
		defaultRequest = new EpisodeList();
		showRequest = new EpisodeList(28);
		subtitleFilteredRequest = new EpisodeList(Filter.VO);
		limitedShowRequest = new EpisodeList(8, 14);
		subtitleShowRequest = new EpisodeList(2, Filter.VOVF);
		subtitleLimitRequest = new EpisodeList(Filter.VF, 88);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, fullRequest.getVerb());
		assertEquals(Verb.GET, defaultRequest.getVerb());
		assertEquals(Verb.GET, showRequest.getVerb());
		assertEquals(Verb.GET, subtitleFilteredRequest.getVerb());
		assertEquals(Verb.GET, limitedShowRequest.getVerb());
		assertEquals(Verb.GET, subtitleShowRequest.getVerb());
		assertEquals(Verb.GET, subtitleLimitRequest.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/episodes/list", fullRequest.getMethod());
		assertEquals("/episodes/list", defaultRequest.getMethod());
		assertEquals("/episodes/list", showRequest.getMethod());
		assertEquals("/episodes/list", subtitleFilteredRequest.getMethod());
		assertEquals("/episodes/list", limitedShowRequest.getMethod());
		assertEquals("/episodes/list", subtitleShowRequest.getMethod());
		assertEquals("/episodes/list", subtitleLimitRequest.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(Arrays.asList(new Parameter<?>[] { new Version(), new ShowId(28), new Limit(14), new Subtitles(Filter.ALL) }),
				fullRequest.getParameters());
		assertEquals(Arrays.asList(new Parameter<?>[] { new Version() }),
				defaultRequest.getParameters());
		assertEquals(Arrays.asList(new Parameter<?>[] { new Version(), new ShowId(28) }),
				showRequest.getParameters());
		assertEquals(Arrays.asList(new Parameter<?>[] { new Version(), new Subtitles(Filter.VO) }),
				subtitleFilteredRequest.getParameters());
		assertEquals(Arrays.asList(new Parameter<?>[] { new Version(), new ShowId(8), new Limit(14) }),
				limitedShowRequest.getParameters());
		assertEquals(Arrays.asList(new Parameter<?>[] { new Version(), new ShowId(2), new Subtitles(Filter.VOVF) }),
				subtitleShowRequest.getParameters());
		assertEquals(Arrays.asList(new Parameter<?>[] { new Version(), new Limit(88), new Subtitles(Filter.VF) }),
				subtitleLimitRequest.getParameters());
	}
	
}
