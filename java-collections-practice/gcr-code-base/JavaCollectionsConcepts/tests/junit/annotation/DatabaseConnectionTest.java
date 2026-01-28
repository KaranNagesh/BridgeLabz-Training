package junit.annotation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.annotation.DatabaseConnection;

class DatabaseConnectionTest {

	// DatabaseConnection object for testing
	private DatabaseConnection dbConnection;

	// Runs before each test to establish connection
	@BeforeEach
	void setUp() {
		dbConnection = new DatabaseConnection();
		dbConnection.connect();
	}

	// Runs after each test to close connection
	@AfterEach
	void tearDown() {
		dbConnection.disconnect();
	}

	// Verifies connection is established before test
	@Test
	void testConnectionEstablished() {
		assertTrue(dbConnection.isConnected());
	}

	// Verifies connection is closed after test
	@Test
	void testConnectionClosed() {
		dbConnection.disconnect();
		assertFalse(dbConnection.isConnected());
	}
}
