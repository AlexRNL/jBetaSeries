package com.alexrnl.jbetaseries.request.members;

import com.alexrnl.jbetaseries.request.APIAddresses;
import com.alexrnl.jbetaseries.request.Request;
import com.alexrnl.jbetaseries.request.Verb;
import com.alexrnl.jbetaseries.request.parameters.AutoDelete;
import com.alexrnl.jbetaseries.request.parameters.LastId;
import com.alexrnl.jbetaseries.request.parameters.Number;
import com.alexrnl.jbetaseries.request.parameters.Sort;
import com.alexrnl.jbetaseries.request.parameters.Summary;


/**
 * Request to get the notifications of the member.<br />
 * @author Alex
 */
public class MemberNotifications extends Request {
	
	public MemberNotifications (final Boolean summary, final Integer number, final Sort.Type sort, final Integer lastId, final Boolean autoDelete) {
		super(Verb.GET, APIAddresses.MEMBERS_NOTIFICATIONS);
		addParameter(new Summary(summary)); // summary: Résumé du nombre de notifications ou complet
		addParameter(new Number(number)); // number: Nombre de notifications
		addParameter(new Sort(sort)); // sort: Tri descendant ou ascendant
		addParameter(new LastId(lastId)); // last_id: Dernier ID
		addParameter(new AutoDelete(autoDelete)); // auto_delete: Suppression automatique des notifications
	}
}
