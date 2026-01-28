package com.reflectionandannotation.annotation.depricated;

class LegacyAPI {

	// Old method (should not be used)
	@Deprecated
	void oldFeature() {
		System.out.println("This is the old feature (deprecated)");
	}

	// New recommended method
	void newFeature() {
		System.out.println("This is the new feature");
	}
}
