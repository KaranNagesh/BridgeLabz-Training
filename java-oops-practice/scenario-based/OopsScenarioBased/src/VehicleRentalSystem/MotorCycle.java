package VehicleRentalSystem;
//Inheriting properties of Vehicle class
public class MotorCycle extends Vehicle  {
	private String withTrunk;
	private int baseRate = 250;
	public MotorCycle(int maxSpeed, String fuelType, String withTrunk) {
		super(maxSpeed, fuelType);
		this.withTrunk = withTrunk;
	}
	
	public void displayInfo() {
		System.out.println("Max Speed -> " + maxSpeed );
		System.out.println("Fuel Type -> " + fuelType );
		System.out.println("With Trunk -> " + withTrunk );
		
	}

	//Calculating Rent of vehicle
	public double calculateRent(int days, int surcharges) {
		return baseRate * days + surcharges;
	}

}