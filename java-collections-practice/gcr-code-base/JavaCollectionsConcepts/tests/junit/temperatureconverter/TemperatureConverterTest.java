package junit.temperatureconverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.temperatureconverter.TemperatureConverter;

class TemperatureConverterTest {

	// Tests Celsius to Fahrenheit conversion
	@Test
	void testCelsiusToFahrenheit() {
		TemperatureConverter converter = new TemperatureConverter();

		assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
		assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
		assertEquals(98.6, converter.celsiusToFahrenheit(37), 0.1);
	}

	// Tests Fahrenheit to Celsius conversion
	@Test
	void testFahrenheitToCelsius() {
		TemperatureConverter converter = new TemperatureConverter();

		assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
		assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
		assertEquals(37.0, converter.fahrenheitToCelsius(98.6), 0.1);
	}
}
