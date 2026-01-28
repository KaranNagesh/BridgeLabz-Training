package junit.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.Calculator;

class CalculatorTest {

	// Calculator object used for testing
	private Calculator calculator;

	// Initializes calculator before each test
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	// Tests addition functionality
	@Test
	void testAdd() {
		assertEquals(10, calculator.add(5, 5));
		assertEquals(-2, calculator.add(-5, 3));
	}

	// Tests subtraction functionality
	@Test
	void testSubtract() {
		assertEquals(2, calculator.subtract(5, 3));
		assertEquals(-8, calculator.subtract(-5, 3));
	}

	// Tests multiplication functionality
	@Test
	void testMultiply() {
		assertEquals(15, calculator.multiply(5, 3));
		assertEquals(0, calculator.multiply(5, 0));
	}

	// Tests division functionality
	@Test
	void testDivide() {
		assertEquals(5, calculator.divide(10, 2));
	}

	// Tests division by zero exception
	@Test
	void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
	}
}
