package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Comment;
import com.alexrnl.jbetaseries.request.parameters.ShowId;
import com.alexrnl.jbetaseries.request.parameters.ToId;

/**
 * Send a recommendation of a show to a friend from the logged account.<br />
 * @author Alex
 */
public class ShowSendRecommendation extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param showId
	 *        the id of the show to recommend.
	 * @param friendId
	 *        the id of the friend to send the recommendation to.
	 * @param comment
	 *        the comment associated to the recommendation (may be <code>null</code>).
	 */
	public ShowSendRecommendation (final Integer showId, final Integer friendId, final String comment) {
		super(Verb.POST, APIAddresses.SHOWS_RECOMMENDATION);
		addParameter(new ShowId(showId));
		addParameter(new ToId(friendId));
		if (comment != null) {
			addParameter(new Comment(comment));
		}
	}
	
	
	/**
	 * Constructor #2.<br />
	 * @param showId
	 *        the id of the show to recommend.
	 * @param friendId
	 *        the id of the friend to send the recommendation to.
	 */
	public ShowSendRecommendation (final Integer showId, final Integer friendId) {
		this(showId, friendId, null);
	}
}
