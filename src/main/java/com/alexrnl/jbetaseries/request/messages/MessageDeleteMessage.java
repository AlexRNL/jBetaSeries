package com.alexrnl.jbetaseries.request.messages;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

/**
 * Request which allow to delete a message from a conversation (or a full conversation).<br />
 * @author Alex
 */
public class MessageDeleteMessage extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param messageId
	 *        the id of the message to delete. If this is the first from the conversation, the whole
	 *        conversation will be deleted.
	 */
	public MessageDeleteMessage (final Integer messageId) {
		super(Verb.DELETE, APIAddresses.MESSAGES_MESSAGE);
		addParameter(new Id(messageId));
	}
}
