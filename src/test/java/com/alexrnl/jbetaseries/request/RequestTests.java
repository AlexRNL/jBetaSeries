package com.alexrnl.jbetaseries.request;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.alexrnl.jbetaseries.request.parameters.ParametersTests;

/**
 * Test suite for the request package.
 * @author Alex
 */
@RunWith(Suite.class)
@SuiteClasses({ ParametersTests.class, FormatTest.class, VerbTest.class })
public class RequestTests {
	
}
