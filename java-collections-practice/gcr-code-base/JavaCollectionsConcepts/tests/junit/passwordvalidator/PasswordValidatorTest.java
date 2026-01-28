package junit.passwordvalidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.passwordvalidator.PasswordValidator;

class PasswordValidatorTest {

	// Tests valid passwords
	@Test
	void testValidPasswords() {
		PasswordValidator validator = new PasswordValidator();

		assertTrue(validator.isValid("Password1"));
		assertTrue(validator.isValid("StrongPass9"));
	}

	// Tests invalid passwords
	@Test
	void testInvalidPasswords() {
		PasswordValidator validator = new PasswordValidator();

		assertFalse(validator.isValid("pass1")); // Too short
		assertFalse(validator.isValid("password1")); // No uppercase
		assertFalse(validator.isValid("PASSWORD")); // No digit
		assertFalse(validator.isValid("PassWord")); // No digit
		assertFalse(validator.isValid(null)); // Null password
	}
}
