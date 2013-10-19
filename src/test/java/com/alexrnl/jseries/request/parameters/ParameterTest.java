package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Parameter} class.
 * @author Alex
 */
public class ParameterTest {
	/** The concrete parameter to test */
	private ConcreteParameter	testParameter;
	
	/**
	 * The concrete parameter to test.
	 * @author Alex
	 */
	private static class ConcreteParameter extends Parameter<String> {
		/**
		 * Constructor #1.<br />
		 * @param name
		 *        the name of the parameter.
		 * @param value
		 *        the value of the parameter.
		 */
		public ConcreteParameter (final String name, final String value) {
			super(name, value);
		}
	}
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		testParameter = new ConcreteParameter("test", "ldr");
	}
	
	/**
	 * Test method for {@link Parameter#hashCode()}.
	 */
	@Test
	public void testHashCode () {
		assertNotEquals(testParameter.hashCode(), new ConcreteParameter("test", "aba").hashCode());
		assertEquals(testParameter.hashCode(), new ConcreteParameter("test", "ldr").hashCode());
		assertEquals(testParameter.hashCode(), testParameter.hashCode());
	}
	
	/**
	 * Test method for {@link Parameter#equals(Object)}.
	 */
	@Test
	public void testEqualsObject () {
		assertNotEquals(testParameter, new ConcreteParameter("test", "aba"));
		assertEquals(testParameter, new ConcreteParameter("test", "ldr"));
		assertEquals(testParameter, testParameter);
		assertNotEquals(testParameter, null);
	}
	
	/**
	 * Test method for {@link Parameter#toString()}.
	 */
	@Test
	public void testToString () {
		assertEquals("ConcreteParameter [name='test', value='ldr']",
				testParameter.toString());
	}
}
