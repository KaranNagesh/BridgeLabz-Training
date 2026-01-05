package smarthomeautomation;

public class UserController {
	
		public static void main(String[] args) {
		//Creating object of light, fan and ac class
		Appliance device1 = new Light(123,10, "Syska", 9);
		Appliance device2 = new Fan(122,100, "Bajaj", 3);
		Appliance device3 = new AC(125,1000, "Blue Star", 2);
		
		//Turning on devices
		device1.turnOn();
		device2.turnOn();
		device3.turnOn();
		
		//Storing power consumption turning off devices
		
		double device1Consumption = device1.turnOff(15);
		double device2Consumption = device2.turnOff(2);
		double device3Consumption = device3.turnOff(3);
		
		//Displaying power consumption
		System.out.println("Light consumes " + device1Consumption + " power");
		System.out.println("Fan consumes " + device2Consumption + " power");
		System.out.println("AC consumes " + device3Consumption + " power");
		
		//Comparing and displaying maximum power consumption
		if((device1Consumption >device2Consumption) && (device1Consumption >device3Consumption)) {
			System.out.println("Light consumes more power than Ac and Fan " + device1Consumption);
		}
		else if((device2Consumption >device1Consumption) && (device2Consumption >device3Consumption)) {
			System.out.println("Fan consumes more power than Ac and Light " + device2Consumption);
		}
		else {
			System.out.println("AC consumes more power than Light and Fan " + device3Consumption);
		}
		
	}
	
	
}
