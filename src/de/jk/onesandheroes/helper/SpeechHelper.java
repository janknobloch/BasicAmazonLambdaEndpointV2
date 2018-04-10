package de.jk.onesandheroes.helper;


public class SpeechHelper {

	public static final String CARDINAL = "cardinal";
	public static final String ORDINAL = "ordinal";
	public static final String DIGITS = "digits";
	public static final String FRACTION = "fraction";
	public static final String UNIT = "unit";
	public static final String DATE = "date";
	public static final String TIME = "time";
	public static final String TELEPHONE = "telephone";
	public static final String ADDRESS = "address";

	public static String wrapInSpeak(String s) {

		return "<speak>" + s + "</speak>";
	}

	public static String preProcessString(String s) {
		s = s.replaceAll("<[^>]*>", "");
		s = s.replaceAll("„", "");
		s = s.replaceAll("“", "");
		s = s.replaceAll("/", " ");
		return s;
	}

	public static String interpretAs(String s, String type) {

		return "<say-as interpret-as=\"" + type + "\">" + s + "</say-as>";

	}

	public static String createBreakSeconds(int seconds) {
		return "<break time=\"" + seconds + "s\"/>";

	}

	public static String createBreakMilliseconds(int milliseconds) {
		return "<break time=\"" + milliseconds + "ms\"/>";

	}

}
