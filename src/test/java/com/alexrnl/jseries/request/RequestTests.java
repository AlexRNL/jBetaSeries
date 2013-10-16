package com.alexrnl.jseries.request;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.alexrnl.jseries.request.parameters.ParametersTests;

/**
 * Test suite for the request package.
 * @author Alex
 */
@RunWith(Suite.class)
@SuiteClasses({ ParametersTests.class, FormatTest.class, VerbTest.class })
public class RequestTests {
	
}
