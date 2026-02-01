package FuntionalInterface.smartdevicecontrolinterface;

public class AC implements Device{

	public AC() {};
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Turning on the AC");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turning off the AC");
		
	}

}
