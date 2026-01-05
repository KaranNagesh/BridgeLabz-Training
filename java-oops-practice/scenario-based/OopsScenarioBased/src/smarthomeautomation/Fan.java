package smarthomeautomation;


public class Fan extends Appliance implements Controllable{
	private int numberOfBlade;
	public Fan(int deviceId, int consumption, String brand, int numberOfBlade) {
		super(deviceId, consumption, brand);
		this.numberOfBlade = numberOfBlade;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Fan is on");
		
	}

	@Override
	public double turnOff(int hours) {
		System.out.println("Fan is Off");
		System.out.println("After running " + hours + " Fan consumes " + (hours * consumption) + " power");
		return hours * consumption;
	}

}