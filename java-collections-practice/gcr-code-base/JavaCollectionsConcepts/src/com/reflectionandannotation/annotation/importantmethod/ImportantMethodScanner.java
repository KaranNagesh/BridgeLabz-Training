package com.reflectionandannotation.annotation.importantmethod;


import java.lang.reflect.Method;

public class ImportantMethodScanner {

	public static void main(String[] args) {

		// Get Class object
		Class<ServiceManager> clazz = ServiceManager.class;

		// Iterate through all declared methods
		for (Method method : clazz.getDeclaredMethods()) {

			// Check if method is annotated
			if (method.isAnnotationPresent(ImportantMethod.class)) {

				// Retrieve annotation
				ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);

				// Print details
				System.out.println("Method: " + method.getName() + ", Importance Level: " + annotation.level());
			}
		}
	}
}