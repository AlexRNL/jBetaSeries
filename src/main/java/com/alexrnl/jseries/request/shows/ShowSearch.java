package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.NumberResultsPerPage;
import com.alexrnl.jseries.request.parameters.Order;
import com.alexrnl.jseries.request.parameters.Order.OrderType;
import com.alexrnl.jseries.request.parameters.Page;
import com.alexrnl.jseries.request.parameters.Summary;
import com.alexrnl.jseries.request.parameters.Title;

/**
 * Search for shows matching a given query.<br />
 * @author Alex
 */
public class ShowSearch extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param title
	 *        the string to look for in the title of the shows.
	 * @param summary
	 *        <code>true</code> to return only the shows main informations (can be <code>null</code>).
	 * @param order
	 *        the order type for the series (can be <code>null</code>).
	 * @param resultsPerPage
	 *        the number of results per page (can be <code>null</code>, default to 5).
	 * @param pageNumber
	 *        the number of the page to load (if <code>null</code>, the first one will be loaded).
	 */
	public ShowSearch (final String title, final Boolean summary, final OrderType order, final Integer resultsPerPage, final Integer pageNumber) {
		super(Verb.GET, APIAddresses.SHOWS_SEARCH);
		addParameter(new Title(title));
		if (summary != null) {
			addParameter(new Summary(summary));
		}
		if (order != null) {
			addParameter(new Order(order));
		}
		if (resultsPerPage != null) {
			addParameter(new NumberResultsPerPage(resultsPerPage));
		}
		if (pageNumber != null) {
			addParameter(new Page(pageNumber));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * @param title
	 *        the string to look for in the title of the shows.
	 * @param summary
	 *        <code>true</code> to return only the shows main informations (can be <code>null</code>).
	 * @param order
	 *        the order type for the series (can be <code>null</code>).
	 */
	public ShowSearch (final String title, final Boolean summary, final OrderType order) {
		this(title, summary, order, null, null);
	}
	
	/**
	 * Constructor #3.<br />
	 * @param title
	 *        the string to look for in the title of the shows.
	 * @param order
	 *        the order type for the series (can be <code>null</code>).
	 */
	public ShowSearch (final String title, final OrderType order) {
		this(title, null, order);
	}
	
	/**
	 * Constructor #w4.<br />
	 * @param title
	 *        the string to look for in the title of the shows.
	 */
	public ShowSearch (final String title) {
		this(title, null);
	}
}
