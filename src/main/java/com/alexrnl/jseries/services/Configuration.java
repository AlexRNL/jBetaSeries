package com.alexrnl.jseries.services;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Class holding the configuration parameters of the connector to the API.<br />
 * @author Alex
 */
public class Configuration {
	
	/** The key of the API */
	private final String	key;
	/** The format of the API response */
	private final Format	format;
	/** The user-agent of the application */
	private final String	userAgent;
	/** The charset to use */
	private final Charset	charset;
	/** <code>true</code> if using the secure API address */
	private final boolean	secure;
	
	/**
	 * Builder class for the {@link Configuration} class.
	 */
	public static class ConfigurationBuilder {
		/** The key of the API */
		private final String	key;
		/** The format of the API response */
		private Format			format;
		/** The user-agent of the application */
		private String			userAgent;
		/** The charset to use */
		private Charset			charset;
		/** <code>true</code> if using the secure API address */
		private boolean			secure;
		
		/**
		 * Constructor #1.<br />
		 * Default parameters are:
		 * <ul>
		 * <li>Format = JSON</li>
		 * <li>user-agent = jSeries</li>
		 * <li>charset = UTF-8</li>
		 * <li>secure = <code>true</code></li>
		 * </ul>
		 * @param key
		 *        the key of the API.
		 */
		public ConfigurationBuilder (final String key) {
			super();
			this.key = key;
			this.format = Format.JSON;
			this.userAgent = "jSeries";
			this.charset = StandardCharsets.UTF_8;
			this.secure = true;
		}
		
		/**
		 * Configuration with the specified format.
		 * @param format
		 *        the format to use.
		 * @return the builder.
		 */
		public ConfigurationBuilder setFormat (final Format format) {
			this.format = format;
			return this;
		}
		
		/**
		 * Configuration with the specified user-agent.
		 * @param userAgent
		 *        the user-agent to use.
		 * @return the builder.
		 */
		public ConfigurationBuilder setUserAgent (final String userAgent) {
			this.userAgent = userAgent;
			return this;
		}
		
		/**
		 * Configuration with the specified charset.
		 * @param charset
		 *        the charset to use.
		 * @return the builder.
		 */
		public ConfigurationBuilder setCharset (final Charset charset) {
			this.charset = charset;
			return this;
		}
		
		/**
		 * Configuration with (<code>HTTPS</code>) or without (<code>HTTP</code>) the security enabled.
		 * @param secure
		 *        true to enable <code>HTTPS</code>.
		 * @return the builder.
		 */
		public ConfigurationBuilder setSecure (final boolean secure) {
			this.secure = secure;
			return this;
		}
		
		/**
		 * Create the configuration object.
		 * @return the configuration resulting of the builder state.
		 */
		public Configuration create () {
			return new Configuration(key, format, userAgent, charset, secure);
		}
	}
	
	/**
	 * Constructor #1.<br />
	 * @param key
	 *        the key of the API.
	 * @param format
	 *        the API response format.
	 * @param userAgent
	 *        the user-agent of the application.
	 * @param charset
	 *        the charset to use.
	 * @param secure
	 *        <code>true</code> if a secure connection shall be used (<code>HTTPS</code>).
	 */
	public Configuration (final String key, final Format format, final String userAgent,
			final Charset charset, final boolean secure) {
		super();
		this.key = key;
		this.format = format;
		this.userAgent = userAgent;
		this.charset = charset;
		this.secure = secure;
	}

	/**
	 * Return the attribute key.
	 * @return the attribute key.
	 */
	public String getKey () {
		return key;
	}
	
	/**
	 * Return the attribute format.
	 * @return the attribute format.
	 */
	public Format getFormat () {
		return format;
	}
	
	/**
	 * Return the attribute userAgent.
	 * @return the attribute userAgent.
	 */
	public String getUserAgent () {
		return userAgent;
	}
	
	/**
	 * Return the attribute charset.
	 * @return the attribute charset.
	 */
	public Charset getCharset () {
		return charset;
	}
	
	/**
	 * Return the attribute isSecure.
	 * @return the attribute isSecure.
	 */
	public boolean isSecure () {
		return secure;
	}
	
}
