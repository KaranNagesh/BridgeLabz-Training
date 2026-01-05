package smarthomeautomation;


public class AC extends Appliance implements Controllable{
	private int ton;
	public AC(int deviceId, int consumption, String brand, int ton) {
		super(deviceId, consumption, brand);
		this.ton = ton;
	}
	
	@Override
	public void turnOn() {
		System.out.println("AC is on");
		
	}

	@Override
	public double turnOff(int hours) {
		System.out.println("AC is Off");
		System.out.println("After running " + hours + " AC consumes " + (hours * consumption) + " power");
		return hours * consumption;
	}

}