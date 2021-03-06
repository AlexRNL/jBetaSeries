package com.alexrnl.jseries.request;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.alexrnl.commons.utils.object.AutoEquals;
import com.alexrnl.commons.utils.object.AutoHashCode;
import com.alexrnl.commons.utils.object.Field;
import com.alexrnl.jseries.request.parameters.Parameter;
import com.alexrnl.jseries.request.parameters.Version;

/**
 * Class defining a generic request to the BetaSeries API.<br />
 * @author Alex
 */
public class Request {
	/** The verb to use for the request */
	private final Verb					verb;
	/** The target method */
	private final String				method;
	/** The parameters of the request */
	private final Set<Parameter<?>>	parameters;
	
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
		this.parameters = new HashSet<>();
		parameters.add(new Version());
	}
	
	/**
	 * Return the attribute verb.
	 * @return the attribute verb.
	 */
	@Field
	public Verb getVerb () {
		return verb;
	}
	
	/**
	 * Return the attribute method.
	 * @return the attribute method.
	 */
	@Field
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
	@Field
	public final Set<Parameter<?>> getParameters () {
		return Collections.unmodifiableSet(parameters);
	}

	@Override
	public int hashCode () {
		return AutoHashCode.getInstance().hashCode(this);
	}

	@Override
	public boolean equals (final Object obj) {
		if (!(obj instanceof Request)) {
			return false;
		}
		return AutoEquals.getInstance().compare(this, (Request) obj);
	}

	@Override
	public String toString () {
		return getClass().getSimpleName() + " [verb=" + verb + ", method=" + method
				+ ", parameters=" + parameters + "]";
	}
}
