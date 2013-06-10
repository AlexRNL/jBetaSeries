package com.alexrnl.jbetaseries.request.messages;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Page;

/**
 * Request for getting the inbox (list of messages of the member).<br />
 * @author Alex
 */
public class MessageInbox extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param pageNumber
	 *        the number of the page to load (if <code>null</code>, the first one will be loaded).
	 */
	public MessageInbox (final Integer pageNumber) {
		super(Verb.GET, APIAddresses.MESSAGES_INBOX);
		if (pageNumber != null) {
			addParameter(new Page(pageNumber));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * Load the first page of the inbox.
	 */
	public MessageInbox () {
		this(null);
	}
}
