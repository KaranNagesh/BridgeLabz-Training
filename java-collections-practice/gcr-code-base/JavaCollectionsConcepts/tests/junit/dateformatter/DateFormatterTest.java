package junit.dateformatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.dateformatter.DateFormatter;

class DateFormatterTest {

	// Tests valid date formatting
	@Test
	void testValidDate() {
		DateFormatter formatter = new DateFormatter();

		assertEquals("25-12-2025", formatter.formatDate("2025-12-25"));
		assertEquals("01-01-2024", formatter.formatDate("2024-01-01"));
	}

	// Tests invalid date format
	@Test
	void testInvalidDateFormat() {
		DateFormatter formatter = new DateFormatter();

		assertThrows(IllegalArgumentException.class, () -> {
			formatter.formatDate("25-12-2025");
		});
	}

	// Tests invalid date value
	@Test
	void testInvalidDateValue() {
		DateFormatter formatter = new DateFormatter();

		assertThrows(IllegalArgumentException.class, () -> {
			formatter.formatDate("2024-13-40");
		});
	}

	// Tests null date input
	@Test
	void testNullDate() {
		DateFormatter formatter = new DateFormatter();

		assertThrows(IllegalArgumentException.class, () -> {
			formatter.formatDate(null);
		});
	}
}
