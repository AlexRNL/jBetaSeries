package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Note} class.
 * @author Alex
 */
public class NoteTest {
	/** The note to test */
	private Note	note;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		note = new Note(3);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("note", note.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(3), note.getValue());
	}
	
	/**
	 * Test method for an invalid note (too low).
	 */
	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void testNoteTooLow () {
		new Note(0);
	}
	
	/**
	 * Test method for an invalid note (too high).
	 */
	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void testNoteTooHigh () {
		new Note(6);
	}
	
}
