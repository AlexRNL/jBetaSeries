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
 * Test suite for the {@link ShowCharacters} class.
 * @author Alex
 */
public class ShowCharactersTest {
	/** Show character request */
	private ShowCharacters	showCharacters;
	/** Show character request with theTVDB id */
	private ShowCharacters	showCharactersTVDB;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showCharacters = new ShowCharacters(8);
		showCharactersTVDB = new ShowCharacters(true, 28);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, showCharacters.getVerb());
		assertEquals(Verb.GET, showCharactersTVDB.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/characters", showCharacters.getMethod());
		assertEquals("/shows/characters", showCharactersTVDB.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Id(8))), showCharacters.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new TheTVDBId(28))), showCharactersTVDB.getParameters());
	}
	
}
