package com.alexrnl.jseries.request.shows;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Comment;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.TheTVDBId;
import com.alexrnl.jseries.request.parameters.To;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link ShowSendRecommendation} class.
 * @author Alex
 */
public class ShowSendRecommendationTest {
	/** Show recommendation request */
	private ShowSendRecommendation	showRecommendation;
	/** Show recommendation request with a comment */
	private ShowSendRecommendation	showRecommendationWithComment;
	/** Show recommendation request with theTVDB id */
	private ShowSendRecommendation	showRecommendationTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showRecommendation = new ShowSendRecommendation(8, 128);
		showRecommendationWithComment = new ShowSendRecommendation(28, 8888, "Awesome show!");
		showRecommendationTVDB = new ShowSendRecommendation(true, 48, 148, null);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.POST, showRecommendation.getVerb());
		assertEquals(Verb.POST, showRecommendationWithComment.getVerb());
		assertEquals(Verb.POST, showRecommendationTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/recommendation", showRecommendation.getMethod());
		assertEquals("/shows/recommendation", showRecommendationWithComment.getMethod());
		assertEquals("/shows/recommendation", showRecommendationTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8), new To(128))), showRecommendation.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(28), new To(8888), new Comment("Awesome show!"))), showRecommendationWithComment.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new TheTVDBId(48), new To(148))), showRecommendationTVDB.getParameters());
	}
}
