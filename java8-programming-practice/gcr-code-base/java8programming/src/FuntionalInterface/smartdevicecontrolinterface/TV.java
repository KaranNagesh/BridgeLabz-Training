package FuntionalInterface.smartdevicecontrolinterface;

public class TV implements Device {
	
	public TV() {};

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Turning on the TV");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turning off the TV");
		
	}

}
