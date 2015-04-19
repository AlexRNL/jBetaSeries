package com.alexrnl.jseries.request.shows;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link ShowFavorite} class.
 * @author Alex
 */
public class ShowFavoriteTest {
	/** Show favorite request */
	private ShowFavorite	showFavorite;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showFavorite = new ShowFavorite(4);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.POST, showFavorite.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/favorite", showFavorite.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(4))), showFavorite.getParameters());
	}
}
