package com.capgemini.moodanalyser;

public class MoodAnalyser {
	private static String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood(String message) throws MoodAnlysisException {
		this.message = message;
		return analyseMood();
	}

	public static String analyseMood() throws MoodAnlysisException {
		try {
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnlysisException("Invalid message,Please Enter Proper message");
		}
	}
}
