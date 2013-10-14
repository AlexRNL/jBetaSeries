package com.alexrnl.jbetaseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Comment} class.
 * @author Alex
 */
public class CommentTest {
	/** A commentary */
	private Comment	comment;
	/** An empty commentary */
	private Comment	emptyComment;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		comment = new Comment("Awesome episode!");
		emptyComment = new Comment("");
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("comments", comment.getName());
		assertEquals("comments", emptyComment.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals("Awesome episode!", comment.getValue());
		assertEquals("", emptyComment.getValue());
	}
}
