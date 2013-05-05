package com.alexrnl.jbetaseries.request.members;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Name;
import com.alexrnl.jbetaseries.request.parameters.Value;

/**
 * Request to change the option of a member.<br />
 * @author Alex
 */
public class MemberOption extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param name
	 *        the name of the option to set.
	 * @param value
	 *        the value to set.
	 */
	public MemberOption (final String name, final String value) {
		super(Verb.POST, APIAddresses.MEMBERS_OPTION);
		addParameter(new Name(name));
		addParameter(new Value(value));
	}
}
