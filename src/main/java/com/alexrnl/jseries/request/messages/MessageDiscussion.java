package com.alexrnl.jseries.request.messages;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdRequestTemplate;

/**
 * Request for getting a conversation by its id.<br />
 * @author Alex
 */
public class MessageDiscussion extends IdRequestTemplate {
	
	/**
	 * Constructor 1.<br />
	 * @param conversationId
	 *        the id of the conversation.
	 */
	public MessageDiscussion (final Integer conversationId) {
		super(Verb.GET, APIAddresses.MESSAGES_DISCUSSION, conversationId);
	}
}
