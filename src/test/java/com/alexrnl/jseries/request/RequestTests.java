package com.alexrnl.jseries.request;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.alexrnl.jseries.request.episodes.EpisodesTests;
import com.alexrnl.jseries.request.messages.MessagesTests;
import com.alexrnl.jseries.request.parameters.ParametersTests;
import com.alexrnl.jseries.request.shows.ShowsTests;
import com.alexrnl.jseries.request.timeline.TimelineTests;

/**
 * Test suite for the request package.
 * @author Alex
 */
@RunWith(Suite.class)
@SuiteClasses({ APIAddressesTest.class, ParametersTests.class, RequestTest.class, VerbTest.class,
		EpisodesTests.class, MessagesTests.class, ShowsTests.class, TimelineTests.class })
public class RequestTests {
	
}
