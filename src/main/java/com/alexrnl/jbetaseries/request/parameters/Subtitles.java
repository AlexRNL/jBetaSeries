package com.alexrnl.jbetaseries.request.parameters;


/**
 * Parameter to set the type of subtitle requested.<br />
 * @author Alex
 */
public class Subtitles extends Parameter<Subtitles.Filter> {
	/** Name for the subtitles parameter */
	public static final String	PARAMETER_SUBTITLES	= "subtitles";
	
	/**
	 * Available subtitle filter in the API.
	 * @author Alex
	 */
	public static enum Filter {
		/** Show all episodes */
		ALL ("all"),
		/** Show episodes which have subtitles in VO or VF */
		VOVF ("vovf"),
		/** Show episodes which have VO subtitles */
		VO ("vo"),
		/** Show episodes which have VF subtitles */
		VF ("vf");
		
		/** The value of the subtitle filter */
		private final String value;
		
		/**
		 * Constructor #1.<br />
		 * @param value the value of the filter.
		 */
		private Filter (final String value) {
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
	 * @param subtitles
	 *        the subtitle filter to set.
	 */
	public Subtitles (final Filter subtitles) {
		super(PARAMETER_SUBTITLES, subtitles);
	}
}
