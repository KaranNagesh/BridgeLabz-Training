package com.regexandjunit.junit.exception;

public class MathUtils {

	// Divides two numbers and throws exception if divisor is zero
	public int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return a / b;
	}
}
