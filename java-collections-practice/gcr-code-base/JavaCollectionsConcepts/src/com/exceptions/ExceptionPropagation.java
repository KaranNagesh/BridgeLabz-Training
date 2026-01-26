package com.exceptions;

public class ExceptionPropagation {

	// Method that causes an exception
	static void method1() {
		// ArithmeticException occurs here
		int result = 10 / 0;
	}

	// Method that calls method1()
	static void method2() {
		method1(); // Exception propagates from method1 to method2
	}

	public static void main(String[] args) {

		try {
			// Call method2()
			method2();

		} catch (ArithmeticException e) {
			// Exception handled here
			System.out.println("Handled exception in main");
		}
	}
}
