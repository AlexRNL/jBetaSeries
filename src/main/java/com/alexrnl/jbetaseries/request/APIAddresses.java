package com.alexrnl.jbetaseries.request;

/**
 * Class with the string constant defining the addresses of the API methods.<br />
 * @author Alex
 */
public final class APIAddresses {
	
	/**
	 * Constructor #1.<br />
	 * Default private constructor.
	 */
	private APIAddresses () {
		super();
	}
	
	// Main address of the API
	/** The host of the API */
	public static final String	HOST					= "api.betaseries.com";
	/** The HTTP prefix, for a standard use of the API */
	public static final String	HTTP					= "http://";
	/** The HTTPS prefix, for a secure usage of the API */
	public static final String	HTTPS					= "https://";
	
	// Methods of the API
	// Methods for members
	/** Address for authenticating a member */
	public static final String MEMBERS_AUTH				= "/members/auth";
	/** Address for getting the badges */
	public static final String MEMBERS_BADGES			= "/members/badges";
	/** Address for destroying the active token */
	public static final String MEMBERS_DESTROY			= "/members/destroy";
	/** Address for getting information on the members */
	public static final String MEMBERS_INFOS			= "/members/infos";
	/** Address for checking the token validity */
	public static final String MEMBERS_IS_ACTIVE		= "/members/is_active";
	/** Address for getting the notifications of the member */
	public static final String MEMBERS_NOTIFICATIONS	= "/members/notifications";
	/** Address for OAuth authentication */
	public static final String MEMBERS_OAUTH			= "/members/oauth";
	/** Address for changing options */
	public static final String MEMBERS_OPTION			= "/members/option";
	/** Address for getting the options */
	public static final String MEMBERS_OPTIONS			= "/members/options";
	/** Address for searching members */
	public static final String MEMBERS_SEARCH			= "/members/search";
	// Methods for shows
	/** Address for archiving or unarchiving shows. */
	public static final String	SHOWS_ARCHIVE			= "/shows/archive";
	/** Address for displaying shows */
	public static final String	SHOWS_DISPLAY			= "/shows/display";
	/** Address for retrieving episodes of shows */
	public static final String	SHOWS_EPISODES			= "/shows/episodes";
	/** Address for noting a show */
	public static final String	SHOWS_NOTE				= "/shows/note";
	/** Address for getting a random show */
	public static final String	SHOWS_RANDOM			= "/shows/random";
	/** Address for recommending shows */
	public static final String	SHOWS_RECOMMENDATION	= "/shows/recommendation";
	/** Address for getting recommendations */
	public static final String	SHOWS_RECOMMENDATIONS	= "/shows/recommendations";
	/** Address for searching for shows */
	public static final String	SHOWS_SEARCH			= "/shows/search";
	/** Address for adding and removing the show */
	public static final String	SHOWS_SHOW				= "/shows/show";
}
