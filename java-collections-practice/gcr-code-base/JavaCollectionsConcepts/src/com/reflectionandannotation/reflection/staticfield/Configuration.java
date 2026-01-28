package com.reflectionandannotation.reflection.staticfield;

public class Configuration {

	// Private static field
	private static String API_KEY = "DEFAULT_KEY";

	// Optional getter (not used by reflection)
	public static String getApiKey() {
		return API_KEY;
	}
}
