package com.alexrnl.jbetaseries;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.alexrnl.jbetaseries.request.RequestTests;

/**
 * All tests for the jBetaSeries library.<br />
 * @author Alex
 */
@RunWith(Suite.class)
@SuiteClasses({ RequestTests.class })
public class AllTests {
	
}
