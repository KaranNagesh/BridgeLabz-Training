package com.regexandjunit.junit.calculator;

public class Calculator {

	// Adds two integers and returns the result
	public int add(int a, int b) {
		return a + b;
	}

	// Subtracts second number from first number
	public int subtract(int a, int b) {
		return a - b;
	}

	// Multiplies two integers
	public int multiply(int a, int b) {
		return a * b;
	}

	// Divides first number by second number
	public int divide(int a, int b) {
		// Throws exception if divisor is zero
		if (b == 0) {
			throw new ArithmeticException("Division by zero is not allowed");
		}
		return a / b;
	}
}
