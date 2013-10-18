package com.alexrnl.jseries.request.parameters;

import com.alexrnl.commons.utils.object.AutoCompare;
import com.alexrnl.commons.utils.object.AutoHashCode;
import com.alexrnl.commons.utils.object.Field;

/**
 * A parameter to be transmitted to the API.<br />
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
	@Field
	public String getName () {
		return name;
	}
	
	/**
	 * Return the attribute value.
	 * @return the attribute value.
	 */
	@Field
	public T getValue () {
		return value;
	}
	
	@Override
	public int hashCode () {
		return AutoHashCode.getInstance().hashCode(this);
	}
	
	@Override
	public boolean equals (final Object obj) {
		if (!(obj instanceof Parameter)) {
			return false;
		}
		return AutoCompare.getInstance().compare(this, (Parameter<?>) obj);
	}
	
	@Override
	public String toString () {
		return getClass().getSimpleName() + " [name='" + name + "', value='" + value + "']";
	}
	
}
