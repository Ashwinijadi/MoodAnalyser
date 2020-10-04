package com.capgemini.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void sad_test() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in sad mood");
		String expected = "SAD";
		String actual = MoodAnalyser.analyseMood();
		assertEquals("SAD",actual);
	}

	public void happy_test() {
		MoodAnalyser mood = new MoodAnalyser("Iam in any mood");
		String expectedMood = "HAPPY";
		String actual = MoodAnalyser.analyseMood();
		assertEquals(expectedMood, actual);
	}

	public void test() {
		MoodAnalyser moodsAnalyse = new MoodAnalyser("Iam in happy mood");
		String expectedMood = "HAPPY";
		String actual = MoodAnalyser.analyseMood();
		assertEquals(expectedMood, actual);
	}
}
