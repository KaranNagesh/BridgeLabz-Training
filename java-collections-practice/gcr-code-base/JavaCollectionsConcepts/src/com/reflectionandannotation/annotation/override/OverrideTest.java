package com.reflectionandannotation.annotation.override;

public class OverrideTest {

	public static void main(String[] args) {

		// Create Dog object
		Animal animal = new Dog();

		// Call overridden method
		animal.makeSound();
	}
}
