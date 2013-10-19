package com.alexrnl.jseries;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.alexrnl.jseries.request.RequestTests;

/**
 * All tests for the jSeries library.<br />
 * @author Alex
 */
@RunWith(Suite.class)
@SuiteClasses({ RequestTests.class })
public class AllTests {
	
}
