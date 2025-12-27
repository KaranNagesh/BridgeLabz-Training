package com.constructorsandinstances.level1;

public class Person {
	String name ;
	int age;
	String address;
	
	//Default constructor
	Person(){
		name = "Allem";
		age = 42;
		address = "new York";
	}
	
	//Parameterized constructor
	Person(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//Copy constructor
	Person(Person p){
		this.name = p.name;
		this.age = p.age;
		this.address = p.address;
	}
	
	//Displaying the details
	void display() {
		System.out.println("Person's name is : " + name);
		System.out.println("Person's age is : " + age);
		System.out.println("Person's address is : " + address);
	}
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Karan";
		person1.age = 21;
		person1.address = "Bhopal";
		
		person1.display();
	}
}
