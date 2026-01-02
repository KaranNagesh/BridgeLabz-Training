package com.inheritance.singlelevel.smarthomedevice;

public class Main {
	public static void main(String[] args) {
		
		//Creating object of Thermostat class
		Device device1 = new Thermostat("123","On","Medium");
		
		//Displaying status
		System.out.println("-----------------------");
		device1.displayStatus();
		System.out.println("-----------------------");

	}
}
