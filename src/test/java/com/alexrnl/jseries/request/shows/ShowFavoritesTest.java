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
 * Test suite for the {@link ShowFavorites} class.
 * @author Alex
 */
public class ShowFavoritesTest {
	/** Show favorites request */
	private ShowFavorites	showFavorites;
	/** Show favorites request for the logged member */
	private ShowFavorites	showFavoritesLoggedMember;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showFavorites = new ShowFavorites(4);
		showFavoritesLoggedMember = new ShowFavorites();
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, showFavorites.getVerb());
		assertEquals(Verb.GET, showFavoritesLoggedMember.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/favorites", showFavorites.getMethod());
		assertEquals("/shows/favorites", showFavoritesLoggedMember.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(4))), showFavorites.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version())), showFavoritesLoggedMember.getParameters());
	}
}
