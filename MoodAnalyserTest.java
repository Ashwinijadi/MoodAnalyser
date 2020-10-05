package com.capgemini.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void sad_test() throws MoodAnlysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in sad mood");
		String actual = "Iam in sad mood";
		String expected = "SAD";
		actual = MoodAnalyser.analyseMood();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void happy_test() throws MoodAnlysisException{
		MoodAnalyser mood = new MoodAnalyser("Iam in any mood");
		String actual = "Iam in any mood";
		String expectedMood = "HAPPY";
		actual = MoodAnalyser.analyseMood();
		Assert.assertEquals(expectedMood, actual);
	}

	@Test
	public void happyTest() throws MoodAnlysisException {
		MoodAnalyser moodsAnalyse = new MoodAnalyser("Iam in happy mood");
		String actual = "Iam in happy mood";
		String expectedmood = "HAPPY";
		actual = MoodAnalyser.analyseMood();
		Assert.assertEquals(expectedmood, actual);
	}

	@Test
	public void givenNullMood() throws MoodAnlysisException{
		MoodAnalyser moods = new MoodAnalyser(null);
		String actual = null;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnlysisException.class);
			actual = MoodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", actual);
		} catch (MoodAnlysisException e) {
			e.printStackTrace();
		}
	}
}
