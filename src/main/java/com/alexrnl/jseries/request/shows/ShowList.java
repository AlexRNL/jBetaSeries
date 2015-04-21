package com.alexrnl.jseries.request.shows;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Order;
import com.alexrnl.jseries.request.parameters.Order.OrderType;
import com.alexrnl.jseries.request.parameters.Since;

/**
 * Retrieve a list with all the series.<br />
 * @author Alex
 */
public class ShowList extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param order
	 *        the order type for the series.
	 * @param since
	 *        if set, return only shows modified since this date (timestamp in milliseconds).
	 */
	public ShowList (final OrderType order, final Long since) {
		super(Verb.GET, APIAddresses.SHOWS_LIST);
		if (order != null) {
			addParameter(new Order(order));
		}
		if (since != null) {
			addParameter(new Since((int) SECONDS.convert(since, MILLISECONDS)));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * @param order
	 *        the order type for the series.
	 */
	public ShowList (final OrderType order) {
		this(order, null);
	}
	
	/**
	 * Constructor #3.<br />
	 * @param since
	 *        if set, return only shows modified since this date (timestamp in milliseconds).
	 */
	public ShowList (final Long since) {
		this(null, since);
	}
	
	/**
	 * Constructor #4.<br />
	 */
	public ShowList () {
		this(null, null);
	}
}
