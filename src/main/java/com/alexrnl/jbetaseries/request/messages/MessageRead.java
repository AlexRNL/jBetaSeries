package com.alexrnl.jbetaseries.request.messages;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Id;

/**
 * Request which allow to mark an message as read.<br />
 * @author Alex
 */
public class MessageRead extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param messageId
	 *        the id of the message to mark as read.
	 */
	public MessageRead (final Integer messageId) {
		super(Verb.POST, APIAddresses.MESSAGES_READ);
		addParameter(new Id(messageId));
	}
}
