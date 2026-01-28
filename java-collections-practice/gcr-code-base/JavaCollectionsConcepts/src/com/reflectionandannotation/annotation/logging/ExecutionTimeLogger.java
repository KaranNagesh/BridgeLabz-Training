package com.reflectionandannotation.annotation.logging;

import java.lang.reflect.Method;

public class ExecutionTimeLogger {

	public static void main(String[] args) {

		PerformanceService service = new PerformanceService();
		Class<?> clazz = service.getClass();

		for (Method method : clazz.getDeclaredMethods()) {

			// Check for @LogExecutionTime
			if (method.isAnnotationPresent(LogExecutionTime.class)) {

				try {
					long start = System.nanoTime();

					// Invoke method dynamically
					method.invoke(service);

					long end = System.nanoTime();

					long duration = end - start;

					System.out.println("Method: " + method.getName() + " | Execution Time: " + duration + " ns");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
