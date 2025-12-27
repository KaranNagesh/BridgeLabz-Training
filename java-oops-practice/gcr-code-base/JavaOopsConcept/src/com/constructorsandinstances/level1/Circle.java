package com.constructorsandinstances.level1;

public class Circle {
	//attribute
	double radius;
	
	//Default constructor
	Circle() {
		this(1.0);
	}
	
	//Parameterized constructor
	Circle(double r){
		this.radius = r;
	}
	
	public static void main(String args[]) {
		Circle circle = new Circle();
		circle.radius = 3;
		System.out.println("The radius of the circle is " + circle.radius);
	}
}
