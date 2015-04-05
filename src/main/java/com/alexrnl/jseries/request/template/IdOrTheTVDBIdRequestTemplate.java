package com.alexrnl.jseries.request.template;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.TheTVDBId;

/**
 * Template of {@link Request} with an {@link Id} or a {@link TheTVDBId}.
 * @author Alex
 */
public class IdOrTheTVDBIdRequestTemplate extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param verb
	 *        the verb of the request.
	 * @param method
	 *        the method of the request.
	 * @param theTVDB
	 *        <code>true</code> if the id is theTVDB id.
	 * @param id
	 *        the id to use in the request.
	 */
	public IdOrTheTVDBIdRequestTemplate (final Verb verb, final String method, final boolean theTVDB, final Integer id) {
		super(verb, method);
		if (theTVDB) {
			addParameter(new TheTVDBId(id));
		} else {
			addParameter(new Id(id));
		}
	}
	
}
