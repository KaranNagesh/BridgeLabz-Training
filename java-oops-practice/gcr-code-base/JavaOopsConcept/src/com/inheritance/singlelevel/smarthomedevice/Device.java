package com.inheritance.singlelevel.smarthomedevice;

//Super class
public class Device {
	protected String deviceId;
	protected String status;
	
	public Device(String deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}
	
	public void displayStatus() {
		System.out.println("Displaying device status");
	}
}