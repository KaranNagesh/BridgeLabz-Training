package VehicleRentalSystem;
//Inheriting properties of Vehicle class
public class Car extends Vehicle{
	private int seatCapacity;
	private int baseRate = 500;
	public Car(int maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	

	@Override
	public void displayInfo() {
		System.out.println("Max Speed -> " + maxSpeed );
		System.out.println("Fuel Type -> " + fuelType );
		System.out.println("Seat Capacity -> " + seatCapacity );
		
	}
	
	//Calculating Rent of vehicle
	public double calculateRent(int days, int surcharges) {
		return baseRate * days + surcharges;
	}

	

}