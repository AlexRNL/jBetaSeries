package com.alexrnl.jbetaseries.request.parameters;

/**
 * A parameter to be transmitted to the API.
 * @author Alex
 * @param <T>
 *        the type of the parameter.
 */
public abstract class Parameter<T> {
	/** The name of the parameter */
	private final String	name;
	/** The value of the parameter */
	private final T			value;
	
	/**
	 * Constructor #1.<br />
	 * @param name
	 *        the name of the parameter.
	 * @param value
	 *        the value of the parameter.
	 */
	protected Parameter (final String name, final T value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	/**
	 * Return the attribute name.
	 * @return the attribute name.
	 */
	public String getName () {
		return name;
	}
	
	/**
	 * Return the attribute value.
	 * @return the attribute value.
	 */
	public T getValue () {
		return value;
	}
	
}
