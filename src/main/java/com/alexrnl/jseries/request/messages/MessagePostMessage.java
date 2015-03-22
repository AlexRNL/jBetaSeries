package com.alexrnl.jseries.request.messages;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Text;
import com.alexrnl.jseries.request.parameters.Title;
import com.alexrnl.jseries.request.parameters.To;

/**
 * Request for sending messages to other members.<br />
 * @author Alex
 */
public class MessagePostMessage extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param memberId
	 *        the id of the member the message will be sent to (mandatory for first message).
	 * @param title
	 *        the title of the message (mandatory for first message).
	 * @param text
	 *        the content of the message.
	 * @param messageId
	 *        the id of the first message in the discussion (in case of a reply).
	 */
	private MessagePostMessage (final Integer memberId, final String title, final String text, final Integer messageId) {
		super(Verb.POST, APIAddresses.MESSAGES_MESSAGE);
		if (memberId != null) {
			addParameter(new To(memberId));
		}
		if (title != null) {
			addParameter(new Title(title));
		}
		addParameter(new Text(text));
		if (messageId != null) {
			addParameter(new Id(messageId));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * Request for a new message to the specified member.
	 * @param memberId
	 *        the member to sent the message.
	 * @param title
	 *        the title of the message.
	 * @param text
	 *        the content of the message.
	 */
	public MessagePostMessage (final Integer memberId, final String title, final String text) {
		this(memberId, title, text, null);
	}
	
	/**
	 * Constructor #3.<br />
	 * Reply to an existing conversation.
	 * @param messageId
	 *        the id of the first message of the conversation.
	 * @param text
	 *        the content of the message.
	 */
	public MessagePostMessage (final Integer messageId, final String text) {
		this(null, null, text, messageId);
	}
}
