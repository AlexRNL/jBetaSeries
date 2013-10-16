package com.alexrnl.jseries.request;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.alexrnl.jseries.request.parameters.BetaVersion;
import com.alexrnl.jseries.request.parameters.Parameter;

/**
 * Abstract class defining a generic request to the BetaSeries API.<br />
 * @author Alex
 */
public abstract class Request {
	/** The verb to use for the request */
	private final Verb					verb;
	/** The target method */
	private final String				method;
	/** The parameters of the request */
	private final List<Parameter<?>>	parameters;
	
	/**
	 * Constructor #1.<br />
	 * @param verb
	 *        the verb of the request.
	 * @param method
	 *        the method of the request.
	 */
	public Request (final Verb verb, final String method) {
		super();
		this.verb = verb;
		this.method = method;
		this.parameters = new LinkedList<>();
		if (APIConstants.IS_BETA) {
			parameters.add(new BetaVersion());
		}
	}
	
	/**
	 * Return the attribute verb.
	 * @return the attribute verb.
	 */
	public Verb getVerb () {
		return verb;
	}
	
	/**
	 * Return the attribute method.
	 * @return the attribute method.
	 */
	public String getMethod () {
		return method;
	}
	
	/**
	 * Add a parameter to the list of parameters.
	 * @param parameter
	 *        the parameter to add.
	 */
	protected void addParameter (final Parameter<?> parameter) {
		parameters.add(parameter);
	}
	
	/**
	 * Return an unmodifiable list of the parameters which are required by the request.<br />
	 * @return the parameters to sent to the API.
	 */
	public final List<Parameter<?>> getParameters () {
		return Collections.unmodifiableList(parameters);
	}
}
