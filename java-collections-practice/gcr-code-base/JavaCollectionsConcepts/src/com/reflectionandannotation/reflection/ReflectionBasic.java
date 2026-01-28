package com.reflectionandannotation.reflection;

import java.lang.reflect.*;
import java.util.Scanner;

public class ReflectionBasic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			// Take class name input
			System.out.print("Enter class name (e.g. java.util.ArrayList): ");
			String className = sc.nextLine();

			// Load class dynamically
			Class<?> cls = Class.forName(className);

			// Print class name
			System.out.println("\nClass Name: " + cls.getName());

			// Display Constructors
			System.out.println("\nConstructors:");
			Constructor<?>[] constructors = cls.getDeclaredConstructors();
			for (Constructor<?> c : constructors) {
				System.out.println(c);
			}

			// Display Fields
			System.out.println("\nFields:");
			Field[] fields = cls.getDeclaredFields();
			for (Field f : fields) {
				System.out.println(f);
			}

			// Display Methods
			System.out.println("\nMethods:");
			Method[] methods = cls.getDeclaredMethods();
			for (Method m : methods) {
				System.out.println(m);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found!");

		} finally {
			sc.close();
		}
	}
}
