package com.inheritance.basics.animal;


// cat inheriting the animal properties
public class Cat extends Animal {

	//default constructor
	Cat(){
		System.out.println("Cat class created");
	}
	
	//parameterized constructor
	Cat(String name){
		System.out.println("Cat class created with the name" + name);
	}
	
	
	//make sound function
	void makeSound() {
		System.out.println("Meow meow");
	}
}
