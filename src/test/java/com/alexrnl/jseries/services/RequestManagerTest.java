package com.alexrnl.jseries.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.alexrnl.commons.io.EditableInputStream;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.request.parameters.Comment;
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
	/** The mocked URL connection */
	@Mock
	private HttpURLConnection		urlConnection;
	/** The response of the mocked connection */
	private EditableInputStream		response;
	/** The response of the mocked connection on error */
	private EditableInputStream		responseError;
	/** The mocked output stream of the connection */
	@Mock
	private OutputStream			outputStream;
	
	/**
	 * Class to test request with parameters.
	 */
	private static class ParameterizedRequest extends Request {
		/**
		 * Constructor #1.<br />
		 * @param verb
		 *        the verb of the request.
		 * @param comment
		 *        the comment to set.
		 */
		public ParameterizedRequest (final Verb verb, final String comment) {
			super(verb, "/api/unit-test");
			addParameter(new Comment(comment));
		}
		
	}
	
	/**
	 * Set up test attributes.
	 * @throws IOException
	 *         if there is an I/O error.
	 */
	@Before
	public void setUp () throws IOException {
		initMocks(this);
		requestManager = new RequestManager(new ConfigurationBuilder("key").setUserAgent("unit-test").create(), httpConnectionProvider);
		response = new EditableInputStream("OK", StandardCharsets.UTF_8);
		responseError = new EditableInputStream("KO", StandardCharsets.UTF_8);
		when(httpConnectionProvider.getHttpConnection(anyString())).thenReturn(urlConnection);
		when(urlConnection.getOutputStream()).thenReturn(outputStream);
		when(urlConnection.getInputStream()).thenReturn(response);
		when(urlConnection.getErrorStream()).thenReturn(responseError);
		when(urlConnection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_OK);
	}
	
	/**
	 * Test method for {@link RequestManager#execute(Request)} with a <code>null</code> request.
	 * @throws IOException
	 *         if the request could not be processed.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteNullRequest () throws IOException {
		requestManager.execute(null);
	}
	
	/**
	 * Test method for {@link RequestManager#execute(Request)} with a GET request and no parameter.
	 * @throws IOException
	 *         if the request could not be processed.
	 */
	@Test
	public void testExecuteGetRequestNoParameters () throws IOException {
		assertEquals("OK", requestManager.execute(new Request(Verb.GET, "/api/unit-test")));
		
		verify(httpConnectionProvider).getHttpConnection(eq("https://api.betaseries.com/api/unit-test?v=2.4"));
		verify(urlConnection).setDoOutput(false);
		verify(urlConnection).setDoInput(true);
		verify(urlConnection).setRequestMethod("GET");
		verify(urlConnection).addRequestProperty(eq("Accept-Charset"), eq("UTF-8"));
		verify(urlConnection).addRequestProperty(eq("User-Agent"), eq("unit-test"));
		verify(urlConnection).addRequestProperty(eq("Accept"), eq("application/json"));
		verify(urlConnection).addRequestProperty(eq("X-BetaSeries-Key"), eq("key"));
		verify(urlConnection, never()).addRequestProperty(eq("X-BetaSeries-Token"), anyString());
		verify(urlConnection, never()).addRequestProperty(eq("Content-Length"), anyString());
		verify(urlConnection, never()).getOutputStream();
	}
	
	/**
	 * Test method for {@link RequestManager#execute(Request)} with a GET request and with parameters.
	 * @throws IOException
	 *         if the request could not be processed.
	 */
	@Test
	public void testExecuteGetRequestWithParameter () throws IOException {
		assertEquals("OK", requestManager.execute(new ParameterizedRequest(Verb.GET, "hello, world")));
		
		verify(httpConnectionProvider).getHttpConnection(eq("https://api.betaseries.com/api/unit-test?v=2.4&comments=hello%2C+world"));
	}
	
	/**
	 * Test method for {@link RequestManager#execute(Request)} with a GET request and with
	 * <code>null</code> parameters.
	 * @throws IOException
	 *         if the request could not be processed.
	 */
	@Test
	public void testExecuteGetRequestWithToken () throws IOException {
		requestManager.setToken("ABCXXX");
		assertEquals("ABCXXX", requestManager.getToken());
		assertEquals("OK", requestManager.execute(new Request(Verb.GET, "/api/unit-test")));
		
		verify(httpConnectionProvider).getHttpConnection(eq("https://api.betaseries.com/api/unit-test?v=2.4"));
		verify(urlConnection).addRequestProperty(eq("X-BetaSeries-Token"), eq("ABCXXX"));
	}
	
	/**
	 * Test method for {@link RequestManager#execute(Request)} with a GET request and with
	 * <code>null</code> parameters.
	 * @throws IOException
	 *         if the request could not be processed.
	 */
	@Test
	public void testExecuteGetRequestWithNullParameter () throws IOException {
		assertEquals("OK", requestManager.execute(new ParameterizedRequest(Verb.GET, null)));
		
		verify(httpConnectionProvider).getHttpConnection(eq("https://api.betaseries.com/api/unit-test?v=2.4&comments"));
	}
	
	/**
	 * Test method for {@link RequestManager#execute(Request)} with a bad address.
	 * @throws IOException
	 *         if the request could not be processed.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteRequestBadAddress () throws IOException {
		when(httpConnectionProvider.getHttpConnection("https://api.betaseries.com/api/unit-test?v=2.4")).thenThrow(new IllegalArgumentException());
		requestManager.execute(new Request(Verb.GET, "/api/unit-test"));
	}
	
	/**
	 * Test method for {@link RequestManager#execute(Request)} with a request that returns an error.
	 * @throws IOException
	 *         if the request could not be processed.
	 */
	@Test
	public void testExecuteError () throws IOException {
		when(urlConnection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_NOT_FOUND);
		assertEquals("KO", requestManager.execute(new Request(Verb.GET, "/api/unit-test")));
	}
	
	/**
	 * Test method for {@link RequestManager#execute(Request)} with a POST request and no parameter.
	 * @throws IOException
	 *         if the request could not be processed.
	 */
	@Test
	public void testExecutePostRequestNoParameter () throws IOException {
		assertEquals("OK", requestManager.execute(new Request(Verb.POST, "/api/unit-test")));
		
		verify(httpConnectionProvider).getHttpConnection(eq("https://api.betaseries.com/api/unit-test"));
		verify(urlConnection).setDoOutput(true);
		verify(urlConnection).setDoInput(true);
		verify(urlConnection).setRequestMethod("POST");
		verify(urlConnection).addRequestProperty(eq("Accept-Charset"), eq("UTF-8"));
		verify(urlConnection).addRequestProperty(eq("User-Agent"), eq("unit-test"));
		verify(urlConnection).addRequestProperty(eq("Accept"), eq("application/json"));
		verify(urlConnection).addRequestProperty(eq("X-BetaSeries-Key"), eq("key"));
		verify(urlConnection, never()).addRequestProperty(eq("X-BetaSeries-Token"), anyString());
		verify(urlConnection).setInstanceFollowRedirects(eq(false));
		verify(urlConnection).addRequestProperty(eq("Content-Length"), eq("5"));
		verify(urlConnection).getOutputStream();
		verify(outputStream).write(any(byte[].class));
		verify(outputStream).flush();
	}
	
	/**
	 * Test method for {@link RequestManager#execute(Request)} with a POST request and with parameters.
	 * @throws IOException
	 *         if the request could not be processed.
	 */
	@Test
	public void testExecutePostRequestWithParameter () throws IOException {
		assertEquals("OK", requestManager.execute(new ParameterizedRequest(Verb.POST, "hello, world")));
		
		verify(urlConnection).addRequestProperty(eq("Content-Length"), eq("29"));
		verify(urlConnection).getOutputStream();
		verify(outputStream).write(any(byte[].class));
		verify(outputStream).flush();
	}
	
}
