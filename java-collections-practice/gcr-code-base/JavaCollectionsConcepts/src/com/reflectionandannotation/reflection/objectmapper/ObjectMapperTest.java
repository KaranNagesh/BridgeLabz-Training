package com.reflectionandannotation.reflection.objectmapper;

import java.util.HashMap;
import java.util.Map;

public class ObjectMapperTest {

	public static void main(String[] args) {

		// Create property map
		Map<String, Object> data = new HashMap<>();
		data.put("id", 101);
		data.put("name", "Arif");
		data.put("age", 22);

		// Convert Map to Student object
		Student student = ObjectMapperUtil.toObject(Student.class, data);

		// Display result
		student.display();
	}
}
