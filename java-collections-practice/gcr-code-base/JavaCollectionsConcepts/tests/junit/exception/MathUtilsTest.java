package junit.exception;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.exception.MathUtils;



class MathUtilsTest {

	// Tests that ArithmeticException is thrown for division by zero
	@Test
	void testDivideByZeroException() {
		MathUtils mathUtils = new MathUtils();

		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));

		assertEquals("Cannot divide by zero", exception.getMessage());
	}

	// Tests normal division scenario
	@Test
	void testDivideSuccess() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(5, mathUtils.divide(10, 2));
	}
}
