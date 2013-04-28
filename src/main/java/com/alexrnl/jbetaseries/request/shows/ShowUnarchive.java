package com.alexrnl.jbetaseries.request.shows;

import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.ShowId;

/**
 * Archive a show in the logged member account.<br />
 * @author Alex
 */
public class ShowUnarchive extends Request {
	
	/** Address of the method */
	private static final String	ADDRESS			= "/shows/archive";
	
	/**
	 * Constructor #1.<br />
	 * @param id
	 *        the id of the show to archive.
	 */
	public ShowUnarchive (final Integer id) {
		super(Verb.DELETE, ADDRESS);
		addParameter(new ShowId(id));
	}
	
}
