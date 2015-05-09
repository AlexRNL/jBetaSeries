package com.alexrnl.jseries.request.shows;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.NumberResultsPerPage;
import com.alexrnl.jseries.request.parameters.Order;
import com.alexrnl.jseries.request.parameters.Order.OrderType;
import com.alexrnl.jseries.request.parameters.Page;
import com.alexrnl.jseries.request.parameters.Summary;
import com.alexrnl.jseries.request.parameters.Title;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Test suite for the {@link ShowSearch} class.
 * @author Alex
 */
public class ShowSearchTest {
	/** Show search request with title only */
	private ShowSearch	showSearch;
	/** Show search request with order */
	private ShowSearch	showSearchWithOrder;
	/** Show search request with only the summary of shows */
	private ShowSearch	showSearchOnlySummary;
	/** Show search request with custom number of results per pages */
	private ShowSearch	showSearchCustomPages;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		showSearch = new ShowSearch("l word");
		showSearchWithOrder = new ShowSearch("fargo", OrderType.FOLLOWERS);
		showSearchOnlySummary = new ShowSearch("person of", true, OrderType.POPULARITY);
		showSearchCustomPages = new ShowSearch("mad", false, null, 20, 8);
	}
	
	/**
	 * Test method for {@link Request#getVerb()}.
	 */
	@Test
	public void testGetVerb () {
		assertEquals(Verb.GET, showSearch.getVerb());
		assertEquals(Verb.GET, showSearchWithOrder.getVerb());
		assertEquals(Verb.GET, showSearchOnlySummary.getVerb());
		assertEquals(Verb.GET, showSearchCustomPages.getVerb());
	}
	
	/**
	 * Test method for {@link Request#getMethod()}.
	 */
	@Test
	public void testGetMethod () {
		assertEquals("/shows/search", showSearch.getMethod());
		assertEquals("/shows/search", showSearchWithOrder.getMethod());
		assertEquals("/shows/search", showSearchOnlySummary.getMethod());
		assertEquals("/shows/search", showSearchCustomPages.getMethod());
	}
	
	/**
	 * Test method for {@link Request#getParameters()}.
	 */
	@Test
	public void testGetParameters () {
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Title("l word"))), showSearch.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Title("fargo"), new Order(OrderType.FOLLOWERS))),
				showSearchWithOrder.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Title("person of"), new Summary(true), new Order(OrderType.POPULARITY))),
				showSearchOnlySummary.getParameters());
		assertEquals(new HashSet<>(Arrays.asList(new Version(), new Title("mad"), new Summary(false), new NumberResultsPerPage(20), new Page(8))),
				showSearchCustomPages.getParameters());
	}
}
