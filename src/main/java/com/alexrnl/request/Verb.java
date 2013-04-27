package com.alexrnl.request;

/**
 * Available verb for the request to the API.
 * @author Alex
 */
public enum Verb {
	/** The GET action, retrieve a ressource */
	GET ("GET"),
	/** The POST action, modify a ressource */
	POST ("POST"),
	/** The PUT action, add a ressource */
	PUT ("PUT"),
	/** The DELETE action, delete a ressource */
	DELETE ("DELETE");
	
	/** the name of the method in the HTTP standard */
	private final String	httpMethodName;
	
	/**
	 * Constructor #1.<br />
	 * Unique constructor for the enumeration.
	 * @param httpMethodName
	 *        the name of the method in the HTTP standard.
	 */
	private Verb (final String httpMethodName) {
		this.httpMethodName = httpMethodName;
	}
	
	/**
	 * Return the attribute httpMethodName.
	 * @return the attribute httpMethodName.
	 */
	public String getHttpMethodName () {
		return httpMethodName;
	}
	
}
