package com.inheritance.basics.animal;

//animal is a parent class for dog , cat and bird
public class Animal {
	String name;
	int age;
	
	//default constructor
	Animal(){
		System.out.println("Animal is created");
	}
	
	
	//parameterized constructor
	Animal(String name){
		System.out.println("Animal " + name + " created");
	}
	
	
	//function of make sound
	void makeSound() {
		System.out.println("Animal is making noises");
	}
}
