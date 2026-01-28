package com.reflectionandannotation.annotation.override;

class Dog extends Animal {

	// Overriding parent method
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}
