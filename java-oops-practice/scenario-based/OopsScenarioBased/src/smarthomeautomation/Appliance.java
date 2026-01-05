package smarthomeautomation;

public class Appliance implements Controllable{
	protected int deviceId;
	protected int consumption;
	protected String brand;
	
	public Appliance(int deviceId, int consumption, String brand) {
		this.deviceId = deviceId;
		this.consumption = consumption;
		this.brand = brand;
	}

	@Override
	public void turnOn() {
		System.out.println("Appliance is on");
		
	}

	@Override
	public double turnOff(int hours) {
		System.out.println("Appliance is Off");
		return hours * consumption;
	}
	
}