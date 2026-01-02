package com.inheritance.basics.animal;


//dog inheriting the animal class properties
public class Dog extends Animal {
	
	//default constructor
	Dog(){
		System.out.println("Dog class created");
	}
	
	//parameterized constructor
	Dog(String name){
		System.out.println("Dog class created with name " + name);
	}	
	
	
	//function of making sound
	void makeSound() {
		System.out.println("Dog is barking");
	}
}
