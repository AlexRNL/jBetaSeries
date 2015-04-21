package com.alexrnl.jseries.request.shows;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Order;
import com.alexrnl.jseries.request.parameters.Order.OrderType;
import com.alexrnl.jseries.request.parameters.Since;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link ShowList} class.
 * @author Alex
 */
public class ShowListTest {
	/** Show list request */
	private ShowList	showList;
	/** Show list request with order */
	private ShowList	showListWithOrder;
	/** Show list request with date */
	private ShowList	showListWithDate;
	/** Show list request with order and date */
	private ShowList	showListWithOrderAndDate;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showList = new ShowList();
		showListWithOrder = new ShowList(OrderType.POPULARITY);
		showListWithDate = new ShowList(2000L);
		showListWithOrderAndDate = new ShowList(OrderType.ALPHABETICAL, 8000L);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, showList.getVerb());
		assertEquals(Verb.GET, showListWithOrder.getVerb());
		assertEquals(Verb.GET, showListWithDate.getVerb());
		assertEquals(Verb.GET, showListWithOrderAndDate.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/list", showList.getMethod());
		assertEquals("/shows/list", showListWithOrder.getMethod());
		assertEquals("/shows/list", showListWithDate.getMethod());
		assertEquals("/shows/list", showListWithOrderAndDate.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version())), showList.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Order(OrderType.POPULARITY))), showListWithOrder.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Since(2))), showListWithDate.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Order(OrderType.ALPHABETICAL), new Since(8))), showListWithOrderAndDate.getParameters());
	}
}
