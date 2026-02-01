package FuntionalInterface.smartdevicecontrolinterface;

public class Lights implements Device {
	
	public Lights() {};

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Turning on the lights");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turning off the lights");
		
	}

}
