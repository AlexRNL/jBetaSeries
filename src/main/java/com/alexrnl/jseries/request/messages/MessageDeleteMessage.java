package com.alexrnl.jseries.request.messages;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdRequestTemplate;

/**
 * Request which allow to delete a message from a conversation (or a full conversation).<br />
 * @author Alex
 */
public class MessageDeleteMessage extends IdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param messageId
	 *        the id of the message to delete. If this is the first from the conversation, the whole
	 *        conversation will be deleted.
	 */
	public MessageDeleteMessage (final Integer messageId) {
		super(Verb.DELETE, APIAddresses.MESSAGES_MESSAGE, messageId);
	}
}
