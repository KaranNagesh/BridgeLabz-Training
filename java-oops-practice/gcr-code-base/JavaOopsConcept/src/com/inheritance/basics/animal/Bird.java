package com.inheritance.basics.animal;


//inheriting the properties of animal class
public class Bird extends Animal {
	
	//default constructors
	Bird(){
		System.out.println("Bird class created");
	}
	
	//parameterized constructor
	Bird(String name){
		System.out.println("Bird class name " + name + "Created");
	}
    
	//function of make sound
	void makeSound(){
		System.out.println("Bird is chirping ");
	}
	
}
