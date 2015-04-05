package com.alexrnl.jseries.request.messages;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.template.IdRequestTemplate;

/**
 * Request which allow to mark an message as read.<br />
 * @author Alex
 */
public class MessageRead extends IdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param messageId
	 *        the id of the message to mark as read.
	 */
	public MessageRead (final Integer messageId) {
		super(Verb.POST, APIAddresses.MESSAGES_READ, messageId);
	}
}
