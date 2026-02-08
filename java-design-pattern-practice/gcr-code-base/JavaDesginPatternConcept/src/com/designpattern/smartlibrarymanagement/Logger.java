
package com.designpattern.smartlibrarymanagement;

//Singleton Logger class
class Logger {

	private static Logger instance; // Single instance

	private Logger() {
	} // Private constructor

	public static synchronized Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public void log(String message) {
		System.out.println("[LOG] " + message);
	}
}
