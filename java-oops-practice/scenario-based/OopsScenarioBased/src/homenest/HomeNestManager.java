package homenest;

public class HomeNestManager {
	public static void main(String[] args) {

		// Polymorphism using base class reference
		Device light = new Light("LIGHT-01");
		Device camera = new Camera("CAM-01");
		Device thermostat = new Thermostat("THERMO-01");
		Device lock = new Lock("LOCK-01");

		// Turn devices ON
		light.turnOn();
		camera.turnOn();

		// Calculate energy usage
		System.out.println("Light energy/day: " + light.calculateDailyEnergy(6));
		System.out.println("Camera energy/day: " + camera.calculateDailyEnergy(10));

		// Reset devices (polymorphism)
		light.reset();
		camera.reset();
		thermostat.reset();
		lock.reset();

		// Turn OFF devices
		light.turnOff();
		camera.turnOff();
	}
}
