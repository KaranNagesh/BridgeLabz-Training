
package homenest;

//Thermostat device
class Thermostat extends Device {

	Thermostat(String deviceId) {
		super(deviceId, 2.0);
	}

	// Reset behavior for Thermostat
	public void reset() {
		System.out.println("Thermostat reset: temperature set to 24°C");
	}
}
