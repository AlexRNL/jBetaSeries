package com.alexrnl.jseries;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.alexrnl.jseries.request.RequestTests;
import com.alexrnl.jseries.services.ServicesTests;

/**
 * All tests for the jSeries library.<br />
 * @author Alex
 */
@RunWith(Suite.class)
@SuiteClasses({ RequestTests.class, ServicesTests.class })
public class AllTests {
	
}
