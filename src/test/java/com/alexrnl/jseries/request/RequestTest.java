package com.alexrnl.jseries.request;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import com.alexrnl.jseries.request.parameters.Id;
import com.alexrnl.jseries.request.parameters.Parameter;

/**
 * Test suite for the {@link Request} class.
 * @author Alex
 */
public class RequestTest {
	/** The request to test */
	private ConcreteRequest testRequest;
	
	/**
	 * Concrete request class for tests.
	 * @author Alex
	 */
	private static class ConcreteRequest extends Request {
		/**
		 * Constructor #1.<br />
		 * @param verb
		 *        the verb of the request.
		 * @param method
		 *        the method of the request.
		 */
		public ConcreteRequest (final Verb verb, final String method) {
			super(verb, method);
		}
		
		@Override
		public void addParameter (final Parameter<?> parameter) {
			super.addParameter(parameter);
		}
	}
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		testRequest = new ConcreteRequest(Verb.DELETE, "/test");
		testRequest.addParameter(new Id(1));
	}
	
	/**
	 * Test method for {@link Request#hashCode()}.
	 */
	@Test
	public void testHashCode () {
		final ConcreteRequest comparing = new ConcreteRequest(Verb.PUT, "/test");
		comparing.addParameter(new Id(1));
		assertNotEquals(testRequest.hashCode(), comparing.hashCode());
		assertEquals(comparing.hashCode(), comparing.hashCode());
		assertEquals(testRequest.hashCode(), testRequest.hashCode());

		final ConcreteRequest comparingOK = new ConcreteRequest(Verb.DELETE, "/test");
		comparingOK.addParameter(new Id(1));
		assertEquals(testRequest.hashCode(), comparingOK.hashCode());
	}
	
	/**
	 * Test method for {@link Request#equals(Object)}.
	 */
	@Test
	public void testEqualsObject () {
		final ConcreteRequest comparing = new ConcreteRequest(Verb.GET, "/test");
		comparing.addParameter(new Id(1));
		assertNotEquals(testRequest, comparing);
		assertEquals(comparing, comparing);
		assertEquals(testRequest, testRequest);
		assertNotEquals(testRequest, null);

		final ConcreteRequest comparingOK = new ConcreteRequest(Verb.DELETE, "/test");
		comparingOK.addParameter(new Id(1));
		assertEquals(testRequest, comparingOK);
	}
	
	/**
	 * Test method for {@link Request#toString()}.
	 */
	@Test
	public void testToString () {
		assertEquals("ConcreteRequest [verb=DELETE, method=/test, parameters=[Version [name='v', value='2.1'], Id [name='id', value='1']]]",
				testRequest.toString());
	}
}
