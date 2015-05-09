package com.alexrnl.jseries.request.shows;

import com.alexrnl.jseries.request.APIAddresses;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Comment;
import com.alexrnl.jseries.request.parameters.To;
import com.alexrnl.jseries.request.template.IdOrTheTVDBIdRequestTemplate;

/**
 * Send a recommendation of a show to a friend from the logged account.<br />
 * @author Alex
 */
public class ShowSendRecommendation extends IdOrTheTVDBIdRequestTemplate {
	
	/**
	 * Constructor #1.<br />
	 * @param theTVDB
	 *        <code>true</code> if the show id is a theTVDB id.
	 * @param showId
	 *        the id of the show to recommend.
	 * @param friendId
	 *        the id of the friend to send the recommendation to.
	 * @param comment
	 *        the comment associated to the recommendation (may be <code>null</code>).
	 */
	public ShowSendRecommendation (final Boolean theTVDB, final Integer showId, final Integer friendId, final String comment) {
		super(Verb.POST, APIAddresses.SHOWS_RECOMMENDATION, theTVDB, showId);
		addParameter(new To(friendId));
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
	 * @param comment
	 *        the comment associated to the recommendation (may be <code>null</code>).
	 */
	public ShowSendRecommendation (final Integer showId, final Integer friendId, final String comment) {
		this(false, showId, friendId, comment);
	}
	
	/**
	 * Constructor #3.<br />
	 * @param showId
	 *        the id of the show to recommend.
	 * @param friendId
	 *        the id of the friend to send the recommendation to.
	 */
	public ShowSendRecommendation (final Integer showId, final Integer friendId) {
		this(showId, friendId, null);
	}
}
