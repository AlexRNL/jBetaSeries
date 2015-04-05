package com.alexrnl.jseries.request.template;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Id;

/**
 * Template of {@link Request} with an {@link Id}.
 * @author Alex
 */
public abstract class IdRequestTemplate extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param verb
	 *        the verb of the request.
	 * @param method
	 *        the method of the request.
	 * @param id
	 *        the id to use in the request.
	 */
	public IdRequestTemplate (final Verb verb, final String method, final Integer id) {
		super(verb, method);
		addParameter(new Id(id));
	}
	
}
