package com.inheritance.singlelevel.smarthomedevice;

//Inheriting properties of Device class
public class Thermostat extends Device {
	private String temperatureSetting;
	
	//Parameterized constructor
	public Thermostat(String deviceId, String status, String temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	
	@Override
	public void displayStatus() {
		System.out.println("Device Id is " + deviceId);
		System.out.println("Status " + status);
		System.out.println("Temperature Setting " + temperatureSetting);
		
	}

}