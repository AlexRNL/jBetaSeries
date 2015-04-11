package com.alexrnl.jseries.request.shows;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite for the shows package.
 * @author Alex
 */
@RunWith(Suite.class)
@SuiteClasses({ ShowArchiveTest.class, ShowCharactersTest.class, ShowDisplayTest.class,
		ShowEpisodesTest.class, ShowUnarchiveTest.class })
public class ShowsTests {
	
}
