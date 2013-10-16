package com.alexrnl.jseries.request.parameters;

/**
 * Enumeration for a BetaSeries boolean.<br />
 * @author Alex
 */
public enum BSBoolean {
	/** The value for <code>false</code>. */
	FALSE ("no"),
	/** The value for <code>true</code>. */
	TRUE ("yes");
	
	/** The value of the */
	private final String	value;
	
	/**
	 * Constructor #1.<br />
	 * @param value
	 *        the value of the boolean.
	 */
	private BSBoolean (final String value) {
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
	
	/**
	 * Find the {@link BSBoolean} matching the value specified.
	 * @param value
	 *        the value.
	 * @return the boolean matching the value.
	 */
	public static BSBoolean fromValue (final String value) {
		for (final BSBoolean bsBoolean : BSBoolean.values()) {
			if (bsBoolean.getValue().equals(value)) {
				return bsBoolean;
			}
		}
		
		throw new IllegalArgumentException("No BSBoolean matching " + value);
	}
	
	/**
	 * Return the {@link BSBoolean} matching the {@link Boolean}.
	 * @param value
	 *        the value.
	 * @return the boolean matching the value.
	 */
	public static BSBoolean fromValue (final boolean value) {
		return value ? TRUE : FALSE;
	}
}
