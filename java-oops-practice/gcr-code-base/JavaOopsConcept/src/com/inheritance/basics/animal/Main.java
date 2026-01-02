package com.inheritance.basics.animal;

public class Main {
	public static void main(String args[]) {
		
		//Creating dog , cat , and bird
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Bird b1 = new Bird();
		
		
		//calling the same method but output with different object is different even herited from the same parent class
		d1.makeSound();
		c1.makeSound();
		b1.makeSound();
	}
}
