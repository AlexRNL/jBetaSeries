package com.alexrnl.jseries.request.episodes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite for the episodes package.
 * @author Alex
 */
@RunWith(Suite.class)
@SuiteClasses({ EpisodeDisplayTest.class, EpisodeDownloadedTest.class, EpisodeLatestTest.class,
		EpisodeListTest.class, EpisodeNotDownloadedTest.class })
public class EpisodesTests {
	
}
