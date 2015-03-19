package com.alexrnl.jseries.request.episodes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite for the episodes package.
 * @author Alex
 */
@RunWith(Suite.class)
@SuiteClasses({ EpisodeDisplayTest.class, EpisodeDownloadedTest.class, EpisodeGradeTest.class,
		EpisodeLatestTest.class, EpisodeListTest.class, EpisodeNextTest.class,
		EpisodeNotDownloadedTest.class, EpisodeUngradeTest.class })
public class EpisodesTests {
	
}
