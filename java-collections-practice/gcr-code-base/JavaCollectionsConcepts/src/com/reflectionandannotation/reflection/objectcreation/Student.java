package com.reflectionandannotation.reflection.objectcreation;

class Student {

	private String name;
	private int age;

	// No-argument constructor
	public Student() {
		this.name = "Unknown";
		this.age = 0;
	}

	public void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}
