package com.alexrnl.jseries.services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite for the services package.
 * @author Alex
 */
@RunWith(Suite.class)
@SuiteClasses({ ConfigurationTest.class, DefaultHttpConnectionProviderTest.class, FormatTest.class })
public class ServicesTests {
	
}
