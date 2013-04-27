package com.alexrnl.request;

import java.util.Map;


/**
 * Abstract class defining a generic request to the BetaSeries API.<br />
 * @author Alex
 */
public abstract class Request {
	/** The verb to use for the request */
	private final String	verb;
	/** The target method */
	private final String	method;
	
	/**
	 * Constructor #1.<br />
	 * @param verb
	 *        the verb of the request.
	 * @param method
	 *        the method of the request.
	 */
	private Request (final String verb, final String method) {
		super();
		this.verb = verb;
		this.method = method;
	}
	
	/**
	 * Return the attribute verb.
	 * @return the attribute verb.
	 */
	public String getVerb () {
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
	 * Return the parameters which are required by the request.<br />
	 * Override this method if parameters are required.
	 * @return the parameters to sent to the API.
	 */
	public Map<String, String> getParameters () {
		return null;
	}
}
