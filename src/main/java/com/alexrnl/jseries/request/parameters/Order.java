package com.alexrnl.jseries.request.parameters;

import com.alexrnl.jseries.request.parameters.Order.OrderType;

/**
 * Parameter to set the order type requested.<br />
 * @author Alex
 */
public class Order extends Parameter<OrderType> {
	/** Name for the order parameter */
	public static final String	PARAMETER_ORDER	= "order";
	
	/**
	 * Order types available in the API.
	 */
	public static enum OrderType {
		/** Show all episodes */
		ALPHABETICAL ("alphabetical"),
		/** Show episodes which have subtitles in VO or VF */
		POPULARITY ("popularity"),
		/** Show episodes which have VO subtitles */
		FOLLOWERS ("followers");
		
		/** The value of the subtitle filter */
		private final String	value;
		
		/**
		 * Constructor #1.<br />
		 * @param value
		 *        the value of the filter.
		 */
		private OrderType (final String value) {
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
	 * @param orderType
	 *        the type of order to set.
	 */
	public Order (final OrderType orderType) {
		super(PARAMETER_ORDER, orderType);
	}
	
}
