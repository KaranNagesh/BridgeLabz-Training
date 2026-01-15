package trafficmanager;


//Class representing a vehicle node in circular linked list
class Vehicle {
	String vehicleNumber;
	Vehicle next;

	Vehicle(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
		this.next = null;
	}
}