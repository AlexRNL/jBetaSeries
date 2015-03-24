package com.alexrnl.jseries;

import java.io.IOException;
import java.util.logging.Logger;

import com.alexrnl.commons.error.ExceptionUtils;
import com.alexrnl.jseries.request.shows.ShowDisplay;
import com.alexrnl.jseries.services.Configuration;
import com.alexrnl.jseries.services.Configuration.ConfigurationBuilder;
import com.alexrnl.jseries.services.DefaultHttpConnectionProvider;
import com.alexrnl.jseries.services.Format;
import com.alexrnl.jseries.services.RequestManager;

/**
 * Entry point of the interface to the BetaSeries API.<br />
 * @author Alex
 */
public final class JSeries {
	/** Logger */
	private static final Logger		LG	= Logger.getLogger(JSeries.class.getName());
	
	/** The request manager */
	private final RequestManager	requestManager;
	
	/**
	 * Constructor #1.<br />
	 * @param configuration
	 *        the configuration of the connector to the BetaSeries API.
	 */
	public JSeries (final Configuration configuration) {
		super();
		this.requestManager = new RequestManager(configuration, new DefaultHttpConnectionProvider());
	}
	
	/**
	 * Entry point of test method.<br />
	 * @param args
	 *        the arguments from the command line.
	 */
	public static void main (final String[] args) {
		final JSeries jSeries = new JSeries(new ConfigurationBuilder("").setFormat(Format.XML).create());
		
		try {
//			LG.info(jSeries.requestManager.execute(new MemberAuth("", "")));
//			jSeries.requestManager.setToken("");
			LG.info(jSeries.requestManager.execute(new ShowDisplay(8)));
//			LG.info(jSeries.requestManager.execute(new MemberDestroy()));
		} catch (final IOException e) {
			LG.warning("Error while processing request: " + ExceptionUtils.display(e));
		}
	}
	
}
