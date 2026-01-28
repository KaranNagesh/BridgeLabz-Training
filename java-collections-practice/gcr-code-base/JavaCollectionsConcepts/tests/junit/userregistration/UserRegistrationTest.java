package junit.userregistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.userregistration.UserRegistration;

class UserRegistrationTest {

	// Tests valid user registration
	@Test
	void testValidUserRegistration() {
		UserRegistration registration = new UserRegistration();

		assertDoesNotThrow(() -> {
			registration.registerUser("john_doe", "john@example.com", "Password1");
		});
	}

	// Tests invalid username
	@Test
	void testInvalidUsername() {
		UserRegistration registration = new UserRegistration();

		assertThrows(IllegalArgumentException.class, () -> {
			registration.registerUser("", "john@example.com", "Password1");
		});
	}

	// Tests invalid email
	@Test
	void testInvalidEmail() {
		UserRegistration registration = new UserRegistration();

		assertThrows(IllegalArgumentException.class, () -> {
			registration.registerUser("john_doe", "johnexample.com", "Password1");
		});
	}

	// Tests invalid password
	@Test
	void testInvalidPassword() {
		UserRegistration registration = new UserRegistration();

		assertThrows(IllegalArgumentException.class, () -> {
			registration.registerUser("john_doe", "john@example.com", "pass");
		});
	}

	// Tests null inputs
	@Test
	void testNullInputs() {
		UserRegistration registration = new UserRegistration();

		assertThrows(IllegalArgumentException.class, () -> {
			registration.registerUser(null, null, null);
		});
	}
}
