package parkease;

public class Main {

	 public static void main(String[] args) {

	     // Create vehicles
	     Vehicle car = new Car("GJ-01-AB-1234");
	     Vehicle bike = new Bike("GJ-05-CD-5678");
	     Vehicle truck = new Truck("RJ-14-TR-9999");

	     // Create parking slots
	     ParkingSlot carSlot = new ParkingSlot(1, "Zone A", "Car");
	     ParkingSlot bikeSlot = new ParkingSlot(2, "Zone B", "Bike");

	     // Assign vehicles to slots
	     carSlot.assignSlot(car);
	     bikeSlot.assignSlot(bike);

	     System.out.println();

	     // Calculate parking charges (polymorphism)
	     int hoursParked = 6;
	     System.out.println("Car Parking Charges: ₹" + car.calculateCharges(hoursParked));
	     System.out.println("Bike Parking Charges: ₹" + bike.calculateCharges(hoursParked));

	     System.out.println();

	     // Release slots
	     carSlot.releaseSlot();
	     bikeSlot.releaseSlot();

	     System.out.println();

	     // Show internal booking logs
	     carSlot.showBookingLog();
	     bikeSlot.showBookingLog();
	 }
}
