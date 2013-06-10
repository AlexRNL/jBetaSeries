package com.alexrnl.jbetaseries.request.messages;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

/**
 * Request for getting a conversation by its id.<br />
 * @author Alex
 */
public class MessageDiscussion extends Request {
	
	/**
	 * Constructor 1.<br />
	 * @param conversationId
	 *        the id of the conversation.
	 */
	public MessageDiscussion (final Integer conversationId) {
		super(Verb.GET, APIAddresses.MESSAGES_DISCUSSION);
		addParameter(new Id(conversationId));
	}
}
