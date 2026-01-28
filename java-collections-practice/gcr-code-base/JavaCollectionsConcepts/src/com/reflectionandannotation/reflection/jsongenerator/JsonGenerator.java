package com.reflectionandannotation.reflection.jsongenerator;

import java.lang.reflect.Field;

public class JsonGenerator {

	// Converts any object to JSON-like string
	public static String toJson(Object obj) {

		if (obj == null) {
			return "null";
		}

		StringBuilder json = new StringBuilder();
		Class<?> clazz = obj.getClass();

		json.append("{");

		Field[] fields = clazz.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {

			Field field = fields[i];
			field.setAccessible(true);

			try {
				json.append("\"").append(field.getName()).append("\": ");

				Object value = field.get(obj);

				// Handle String values with quotes
				if (value instanceof String) {
					json.append("\"").append(value).append("\"");
				} else {
					json.append(value);
				}

				// Add comma except for last field
				if (i < fields.length - 1) {
					json.append(", ");
				}

			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}

		json.append("}");
		return json.toString();
	}
}
