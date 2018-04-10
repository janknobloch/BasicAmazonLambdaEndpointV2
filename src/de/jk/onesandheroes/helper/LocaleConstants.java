package de.jk.onesandheroes.helper;


import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleConstants {
	public static final String ONLAUNCH = "ONLAUNCH";
	public static final String HELLO = "HELLO";
	public static final String STOP_CANCEL = "STOP_CANCEL";
	public static final String HELP = "HELP";
	

	public static void main(String[] args) {

		ResourceBundle german = ResourceBundle.getBundle("Languages", Locale.GERMAN);
		Enumeration german_keys = german.getKeys();

		while (german_keys.hasMoreElements()) {
			String key = (String) german_keys.nextElement();
			String value = german.getString(key);
			System.out.println("key = " + key + ", " + "value = " + value);
		}

		ResourceBundle english = ResourceBundle.getBundle("Languages", Locale.ENGLISH);
		Enumeration english_keys = german.getKeys();

		while (english_keys.hasMoreElements()) {
			String key = (String) english_keys.nextElement();
			String value = english.getString(key);
			System.out.println("key = " + key + ", " + "value = " + value);
		}
	}
}
