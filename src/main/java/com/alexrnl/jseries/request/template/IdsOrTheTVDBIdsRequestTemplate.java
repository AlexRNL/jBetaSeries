package com.alexrnl.jseries.request.template;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Ids;
import com.alexrnl.jseries.request.parameters.TheTVDBIds;

/**
 * Template of {@link Request} with an {@link Ids} or a {@link TheTVDBIds}.
 * @author Alex
 */
public class IdsOrTheTVDBIdsRequestTemplate extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param verb
	 *        the verb of the request.
	 * @param method
	 *        the method of the request.
	 * @param theTVDB
	 *        <code>true</code> if the ids are the theTVDB ids.
	 * @param ids
	 *        the ids to use in the request.
	 * @throws IllegalArgumentException
	 *         if there are no id provided.
	 */
	public IdsOrTheTVDBIdsRequestTemplate (final Verb verb, final String method, final boolean theTVDB, final Integer... ids) {
		super(verb, method);
		if (ids == null || ids.length == 0) {
			throw new IllegalArgumentException("At least one id is required");
		}
		
		if (theTVDB) {
			addParameter(new TheTVDBIds(ids));
		} else {
			addParameter(new Ids(ids));
		}
	}
	
}
