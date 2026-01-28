package com.reflectionandannotation.annotation.depricated;

public class DeprecatedTest {

	public static void main(String[] args) {

		LegacyAPI api = new LegacyAPI();

		// Calling deprecated method
		api.oldFeature(); // ⚠️ Compiler warning

		// Calling new method
		api.newFeature();
	}
}
