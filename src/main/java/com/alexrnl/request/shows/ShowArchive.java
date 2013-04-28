package com.alexrnl.request.shows;

import java.util.HashMap;
import java.util.Map;

import com.alexrnl.request.Request;
import com.alexrnl.request.Verb;

/**
 * Archive a show in the logged member account.<br />
 * @author Alex
 */
public class ShowArchive extends Request {
	
	/** Address of the method */
	private static final String	ADDRESS			= "/shows/archive";
	/** Name of the id parameter */
	private static final String	PARAMETER_ID	= "id";
	
	/** The id of the show to archive */
	private final Integer		id;
	
	/**
	 * Constructor #1.<br />
	 * @param id
	 *        the id of the show to archive.
	 */
	public ShowArchive (final Integer id) {
		super(Verb.GET, ADDRESS);
		this.id = id;
	}
	
	/**
	 * Return the attribute id.
	 * @return the attribute id.
	 */
	public Integer getId () {
		return id;
	}
	
	@Override
	public Map<String, String> getParameters () {
		final Map<String, String> parameters = new HashMap<>();
		parameters.put(PARAMETER_ID, getId().toString());
		return parameters;
	}
	
}
