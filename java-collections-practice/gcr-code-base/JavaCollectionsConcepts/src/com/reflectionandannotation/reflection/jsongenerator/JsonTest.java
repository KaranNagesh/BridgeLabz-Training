package com.reflectionandannotation.reflection.jsongenerator;

public class JsonTest {

	public static void main(String[] args) {

		Student student = new Student(101, "Arif", 22);

		String json = JsonGenerator.toJson(student);

		System.out.println(json);
	}
}
