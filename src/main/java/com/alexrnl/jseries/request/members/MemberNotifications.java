package com.alexrnl.jseries.request.members;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.AutoDelete;
import com.alexrnl.jseries.request.parameters.LastId;
import com.alexrnl.jseries.request.parameters.Number;
import com.alexrnl.jseries.request.parameters.Sort;
import com.alexrnl.jseries.request.parameters.Sort.Type;
import com.alexrnl.jseries.request.parameters.Summary;


/**
 * Request to get the notifications of the member.<br />
 * @author Alex
 */
public class MemberNotifications extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param summary
	 *        <code>true</code> if just the number of notifications is required.
	 * @param number
	 *        Number of notification required.
	 * @param autoDelete
	 *        <code>true</code> to automatically delete the notifications.
	 * @param sort
	 *        order for the notification.
	 * @param lastId
	 *        the last id of the notification to retrieve.
	 */
	private MemberNotifications (final Boolean summary, final Integer number, final Boolean autoDelete,
			final Sort.Type sort, final Integer lastId) {
		super(Verb.GET, APIAddresses.MEMBERS_NOTIFICATIONS);
		if (summary != null) {
			addParameter(new Summary(summary));
		}
		if (number != null) {
			addParameter(new Number(number));
		}
		if (sort != null) {
			addParameter(new Sort(sort));
		}
		if (lastId != null) {
			addParameter(new LastId(lastId));
		}
		if (autoDelete != null) {
			addParameter(new AutoDelete(autoDelete));
		}
	}
	
	/**
	 * Constructor #2.<br />
	 * If any of the parameter is <code>null</code>, it will not be used.
	 * @param number
	 *        Number of notification required.
	 * @param autoDelete
	 *        <code>true</code> to automatically delete the notifications.
	 * @param sort
	 *        order for the notification.
	 */
	public MemberNotifications (final Integer number, final Boolean autoDelete, final Type sort) {
		this(false, number, autoDelete, sort, null);
	}
	
	/**
	 * Constructor #3.<br />
	 * If any of the parameter is <code>null</code>, it will not be used.
	 * @param number
	 *        Number of notification required.
	 * @param autoDelete
	 *        <code>true</code> to automatically delete the notifications.
	 * @param lastId
	 *        the last id of the notification to retrieve.
	 */
	public MemberNotifications (final Integer number, final Boolean autoDelete, final Integer lastId) {
		this(false, number, autoDelete, null, lastId);
	}
	
	/**
	 * Constructor #4.<br />
	 * Default constructor.
	 */
	public MemberNotifications () {
		this(null, null, null, null, null);
	}
	
	/**
	 * Constructor #5.<br />
	 * @param summary
	 *        <code>true</code> if just the number of notifications is required.
	 */
	public MemberNotifications (final Boolean summary) {
		this (summary, null, null, null, null);
	}
}
