package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.parameters.Subtitles.Filter;

/**
 * Test suite for the {@link Subtitles} class.
 * @author Alex
 */
public class SubtitlesTest {
	/** The all subtitle parameter to test */
	private Subtitles	subtitleAll;
	/** The VO subtitle parameter to test */
	private Subtitles	subtitleVO;
	/** The VF subtitle parameter to test */
	private Subtitles	subtitleVF;
	/** The VOVF subtitle parameter to test */
	private Subtitles	subtitleVOVF;
	/** The flag subtitles to test */
	private Subtitles	subtitleNull;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		subtitleAll = new Subtitles(Filter.ALL);
		subtitleVO = new Subtitles(Filter.VO);
		subtitleVF = new Subtitles(Filter.VF);
		subtitleVOVF = new Subtitles(Filter.VOVF);
		subtitleNull = new Subtitles();
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("subtitles", subtitleAll.getName());
		assertEquals("subtitles", subtitleVO.getName());
		assertEquals("subtitles", subtitleVF.getName());
		assertEquals("subtitles", subtitleVOVF.getName());
		assertEquals("subtitles", subtitleNull.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Filter.ALL, subtitleAll.getValue());
		assertEquals(Filter.VO, subtitleVO.getValue());
		assertEquals(Filter.VF, subtitleVF.getValue());
		assertEquals(Filter.VOVF, subtitleVOVF.getValue());
		assertNull(subtitleNull.getValue());
	}
	
	/**
	 * Test method for the {@link Filter} enumeration.
	 */
	@Test
	public void testSubtitlesFilterEnum () {
		assertEquals("all", Filter.ALL.getValue());
		assertEquals("vo", Filter.VO.getValue());
		assertEquals("vf", Filter.VF.getValue());
		assertEquals("vovf", Filter.VOVF.getValue());
		assertEquals("all", Filter.ALL.toString());
		assertEquals("vo", Filter.VO.toString());
		assertEquals("vf", Filter.VF.toString());
		assertEquals("vovf", Filter.VOVF.toString());
	}
}
