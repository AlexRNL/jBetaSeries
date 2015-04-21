package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.commons.utils.object.ReflectUtils;
import com.alexrnl.jseries.request.parameters.Order.OrderType;
import com.alexrnl.jseries.request.parameters.Subtitles.Filter;

/**
 * Test suite for the {@link Order} class.
 * @author Alex
 */
public class OrderTest {
	/** The alphabetical order parameter to test */
	private Order	orderAlphabetical;
	/** The popularity order parameter to test */
	private Order	orderPopularity;
	/** The followers order parameter to test */
	private Order	orderFollowers;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		orderAlphabetical = new Order(OrderType.ALPHABETICAL);
		orderPopularity = new Order(OrderType.POPULARITY);
		orderFollowers = new Order(OrderType.FOLLOWERS);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("order", orderAlphabetical.getName());
		assertEquals("order", orderPopularity.getName());
		assertEquals("order", orderFollowers.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(OrderType.ALPHABETICAL, orderAlphabetical.getValue());
		assertEquals(OrderType.POPULARITY, orderPopularity.getValue());
		assertEquals(OrderType.FOLLOWERS, orderFollowers.getValue());
	}
	
	/**
	 * Test method for the {@link Filter} enumeration.
	 */
	@Test
	public void testSubtitlesFilterEnum () {
		assertEquals("alphabetical", OrderType.ALPHABETICAL.getValue());
		assertEquals("popularity", OrderType.POPULARITY.getValue());
		assertEquals("followers", OrderType.FOLLOWERS.getValue());
		assertEquals("alphabetical", OrderType.ALPHABETICAL.toString());
		assertEquals("popularity", OrderType.POPULARITY.toString());
		assertEquals("followers", OrderType.FOLLOWERS.toString());
	}
	
	/**
	 * Trigger a full enum coverage on the {@link Filter} enum.
	 */
	@Test
	public void fullStateEnumCoverage () {
		ReflectUtils.fullEnumCoverage(OrderType.class);
	}
	
}
