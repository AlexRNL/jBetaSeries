package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.commons.utils.object.ReflectUtils;
import com.alexrnl.jseries.request.parameters.Sort.Type;

/**
 * Test suite for the {@link Sort} class.
 * @author Alex
 */
public class SortTest {
	/** The sortAscending attribute to set */
	private Sort	sortAscending;
	/** The sortDescending attribute to set */
	private Sort	sortDescending;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		sortAscending = new Sort(Type.ASCENDING);
		sortDescending = new Sort(Type.DESCENDING);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("sort", sortAscending.getName());
		assertEquals("sort", sortDescending.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Type.ASCENDING, sortAscending.getValue());
		assertEquals(Type.DESCENDING, sortDescending.getValue());
	}
	
	/**
	 * Test method for the {@link Type} enumeration.
	 */
	@Test
	public void testSortTypeEnum () {
		assertEquals("asc", Type.ASCENDING.getValue());
		assertEquals("desc", Type.DESCENDING.getValue());
		assertEquals("asc", Type.ASCENDING.toString());
		assertEquals("desc", Type.DESCENDING.toString());
	}
	
	/**
	 * Trigger a full enum coverage on the {@link Type} enum.
	 */
	@Test
	public void fullStateEnumCoverage () {
		ReflectUtils.fullEnumCoverage(Type.class);
	}
	
}
