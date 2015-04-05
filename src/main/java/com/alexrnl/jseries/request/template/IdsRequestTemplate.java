package com.alexrnl.jseries.request.template;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Ids;

/**
 * Template of {@link Request} with an {@link Ids}.
 * @author Alex
 */
public class IdsRequestTemplate extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param verb
	 *        the verb of the request.
	 * @param method
	 *        the method of the request.
	 * @param ids
	 *        the ids to use in the request.
	 */
	public IdsRequestTemplate (final Verb verb, final String method, final Integer... ids) {
		super(verb, method);
		addParameter(new Ids(ids));
	}
	
}
