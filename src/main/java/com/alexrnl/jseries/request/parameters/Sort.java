package com.alexrnl.jseries.request.parameters;

/**
 * Parameter which allow to set an order on the notifications received.<br />
 * @author Alex
 */
public class Sort extends Parameter<Sort.Type> {
	/** The name of the sort parameter */
	public static final String	PARAMETER_SORT	= "sort";
	
	/**
	 * Sort type enumeration for the API.
	 * @author Alex
	 */
	public static enum Type {
		/** Ascending sort ordering */
		ASCENDING ("asc"),
		/** Descending sort ordering */
		DESCENDING ("desc");
		
		/** The value of the sorting type */
		private final String	value;
		
		/**
		 * Constructor #1.<br />
		 * @param value
		 *        the value of the type.
		 */
		private Type (final String value) {
			this.value = value;
		}

		/**
		 * Return the attribute value.
		 * @return the attribute value.
		 */
		public String getValue () {
			return value;
		}

		@Override
		public String toString () {
			return getValue();
		}
		
		
	}
	
	/**
	 * Constructor #1.<br />
	 * @param sort
	 *        the sort type required.
	 */
	public Sort (final Type sort) {
		super(PARAMETER_SORT, sort);
	}
}
