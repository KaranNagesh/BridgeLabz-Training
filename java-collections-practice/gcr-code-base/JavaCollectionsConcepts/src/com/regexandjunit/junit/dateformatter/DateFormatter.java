package com.regexandjunit.junit.dateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

	// Converts date from yyyy-MM-dd to dd-MM-yyyy
	public String formatDate(String inputDate) {
		if (inputDate == null) {
			throw new IllegalArgumentException("Date cannot be null");
		}

		try {
			// Parses input date
			LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ISO_LOCAL_DATE);

			// Formats date to required pattern
			return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("Invalid date format");
		}
	}
}
