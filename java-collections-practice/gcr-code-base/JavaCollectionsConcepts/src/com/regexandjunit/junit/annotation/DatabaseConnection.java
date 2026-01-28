package com.regexandjunit.junit.annotation;

public class DatabaseConnection {

	// Flag to track connection status
	private boolean connected = false;

	// Establishes the database connection
	public void connect() {
		connected = true;
	}

	// Closes the database connection
	public void disconnect() {
		connected = false;
	}

	// Returns current connection status
	public boolean isConnected() {
		return connected;
	}
}
