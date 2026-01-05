package smarthomeautomation;


public class Light extends Appliance  {
	protected int watt;
	public Light(int deviceId, int consumption, String brand,int watt) {
		super(deviceId, consumption, brand);
		this.watt = watt;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Light is on");
		
	}

	@Override
	public double turnOff(int hours) {
		System.out.println("Light is Off");
		System.out.println("After running " + hours + " Light consumes " + (hours * consumption) + " power");
		return hours * consumption;
	}
}