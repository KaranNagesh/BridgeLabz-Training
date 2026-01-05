package VehicleRentalSystem;
//Super class
public class Vehicle implements Rentable {
	protected int maxSpeed;
	protected String fuelType;
	
	public Vehicle(int maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	//Method to be override
	public void displayInfo() {
		System.out.println("Displaying vehicle info");
		
	}

	@Override
	public double calculateRent(int days, int surcharge) {
		
		return 0;
	}
}