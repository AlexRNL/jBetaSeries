package com.alexrnl.jseries.request;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.alexrnl.jseries.request.episodes.EpisodesTests;
import com.alexrnl.jseries.request.parameters.ParametersTests;

/**
 * Test suite for the request package.
 * @author Alex
 */
@RunWith(Suite.class)
@SuiteClasses({ ParametersTests.class, RequestTest.class, FormatTest.class, VerbTest.class,
		EpisodesTests.class })
public class RequestTests {
	
}
