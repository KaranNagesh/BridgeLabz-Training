package com.reflectionandannotation.reflection.dicontainer;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SimpleDIContainer {

	// Stores singleton instances
	private static final Map<Class<?>, Object> container = new HashMap<>();

	// Creates object and injects dependencies
	public static <T> T getBean(Class<T> clazz) {

		try {
			// Create main object
			T instance = clazz.getDeclaredConstructor().newInstance();

			// Scan fields
			for (Field field : clazz.getDeclaredFields()) {

				if (field.isAnnotationPresent(Inject.class)) {

					Class<?> fieldType = field.getType();

					// Create dependency if not already created
					Object dependency = container.computeIfAbsent(fieldType, SimpleDIContainer::createInstance);

					// Inject dependency
					field.setAccessible(true);
					field.set(instance, dependency);
				}
			}

			return instance;

		} catch (Exception e) {
			throw new RuntimeException("DI failed", e);
		}
	}

	// Helper method to create objects
	private static Object createInstance(Class<?> clazz) {
		try {
			return clazz.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
