package com.alexrnl.jseries.services;

import static org.junit.Assert.fail;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.services.Configuration.ConfigurationBuilder;

/**
 * Test suite for the {@link RequestManager} class.
 * @author Alex
 */
public class RequestManagerTest {
	/** The request manager to test */
	private RequestManager			requestManager;
	/** The mocked HTTP connection provider */
	@Mock
	private HttpConnectionProvider	httpConnectionProvider;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		initMocks(this);
		requestManager = new RequestManager(new ConfigurationBuilder("key").setUserAgent("unit-test").create(), httpConnectionProvider);
	}
	
	/**
	 * Test method for {@link RequestManager#execute(Request)}.
	 */
	@Test
	public void testExecute () {
		fail("Not yet implemented"); // TODO
	}
	
}
