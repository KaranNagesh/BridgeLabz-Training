package com.reflectionandannotation.annotation.repeatableannotation;


import java.lang.reflect.Method;

public class RepeatableAnnotation {

	public static void main(String[] args) {

		try {
			// Get method
			Method method = SoftwareModule.class.getMethod("execute");

			// Retrieve all BugReport annotations
			BugReport[] reports = method.getAnnotationsByType(BugReport.class);

			// Print all bug reports
			for (BugReport report : reports) {
				System.out.println("Bug: " + report.description());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}