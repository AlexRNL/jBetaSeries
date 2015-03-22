package com.alexrnl.jseries.request;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

/**
 * Test suite for the {@link APIConstants} class.
 * @author Alex
 */
public class APIConstantsTest {
	
	/**
	 * Check that no instance can be created.
	 * @throws Exception
	 *         if there is a reflection exception thrown.
	 */
	@Test(expected = InvocationTargetException.class)
	public void testForbiddenInstance () throws Exception {
		final Constructor<?> defaultConstructor = APIConstants.class.getDeclaredConstructors()[0];
		defaultConstructor.setAccessible(true);
		defaultConstructor.newInstance();
	}
}
