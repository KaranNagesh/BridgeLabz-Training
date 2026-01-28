package com.reflectionandannotation.annotation.serialization;

import java.lang.reflect.Field;

public class JsonSerializer {

	public static String toJson(Object obj) {

		if (obj == null)
			return "null";

		StringBuilder json = new StringBuilder("{");
		Class<?> clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();
		boolean first = true;

		for (Field field : fields) {

			if (field.isAnnotationPresent(JsonField.class)) {

				field.setAccessible(true);
				JsonField annotation = field.getAnnotation(JsonField.class);

				try {
					Object value = field.get(obj);

					if (!first) {
						json.append(", ");
					}

					json.append("\"").append(annotation.name()).append("\": ");

					if (value instanceof String) {
						json.append("\"").append(value).append("\"");
					} else {
						json.append(value);
					}

					first = false;

				} catch (IllegalAccessException e) {
					throw new RuntimeException(e);
				}
			}
		}

		json.append("}");
		return json.toString();
	}
}
