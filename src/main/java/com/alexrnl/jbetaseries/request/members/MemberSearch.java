package com.alexrnl.jbetaseries.request.members;

import java.util.Objects;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.Login;

/**
 * Request for searching for a member.<br />
 * @author Alex
 */
public class MemberSearch extends Request {
	
	/**
	 * Constructor #1.<br />
	 * @param login
	 *        the login to search for.
	 * @throws IllegalArgumentException
	 *         if the login is less than 2 characters long.
	 */
	public MemberSearch (final String login) throws IllegalArgumentException {
		super(Verb.GET, APIAddresses.MEMBERS_SEARCH);
		Objects.requireNonNull(login, "Cannot search for null string");
		if (login.length() < 2) {
			throw new IllegalArgumentException("Cannot search member with less than 2 characters.");
		}
		addParameter(new Login(login));
	}
}
