package com.reflectionandannotation.reflection.objectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapperUtil {

	// Generic method to map Map -> Object
	public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {

		try {
			// Create object dynamically
			T obj = clazz.getDeclaredConstructor().newInstance();

			// Iterate over map entries
			for (Map.Entry<String, Object> entry : properties.entrySet()) {

				String fieldName = entry.getKey();
				Object fieldValue = entry.getValue();

				// Get field by name
				Field field = clazz.getDeclaredField(fieldName);

				// Allow access to private field
				field.setAccessible(true);

				// Set field value
				field.set(obj, fieldValue);
			}

			return obj;

		} catch (Exception e) {
			throw new RuntimeException("Object mapping failed", e);
		}
	}
}
