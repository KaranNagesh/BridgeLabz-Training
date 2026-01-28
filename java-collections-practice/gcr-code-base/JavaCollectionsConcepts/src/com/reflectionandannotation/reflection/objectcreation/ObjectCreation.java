package com.reflectionandannotation.reflection.objectcreation;

import java.lang.reflect.Constructor;

public class ObjectCreation {

	public static void main(String[] args) {

		try {
			// Load Student class dynamically
			Class<?> cls = Class.forName("com.reflectionandannotation.reflection.objectcreation.Student");

			// Get no-argument constructor
			Constructor<?> constructor = cls.getDeclaredConstructor();

			// Create object WITHOUT using new
			Object obj = constructor.newInstance();

			// Cast to Student
			Student student = (Student) obj;

			// Call method
			student.display();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
