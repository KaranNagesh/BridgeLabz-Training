
package homenest;

//Abstract base class for all smart devices
abstract class Device implements IControllable {

	protected String deviceId;
	private boolean status; // Encapsulated: cannot be modified externally
	protected double energyUsage;

	// Protected firmware logs (secured using access modifier)
	protected String firmwareLog = "Firmware v1.0 initialized";

	// Constructor to register device with user
	Device(String deviceId, double energyUsage) {
		this.deviceId = deviceId;
		this.energyUsage = energyUsage;
		this.status = false;
		System.out.println("Device registered: " + deviceId);
	}

	// Getter for device status
	public boolean isOn() {
		return status;
	}

	// Turn device ON
	public void turnOn() {
		status = true;
		System.out.println(deviceId + " turned ON");
	}

	// Turn device OFF
	public void turnOff() {
		status = false;
		System.out.println(deviceId + " turned OFF");
	}

	// Operator usage for energy calculation
	public double calculateDailyEnergy(int hours) {
		return energyUsage * hours; // operator *
	}

	// Polymorphic method
	public abstract void reset();
}
