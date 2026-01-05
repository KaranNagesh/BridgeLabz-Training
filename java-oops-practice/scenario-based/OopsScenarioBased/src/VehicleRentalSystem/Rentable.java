package VehicleRentalSystem;


//Interface to hide payment calculation logic
public interface Rentable {
	double calculateRent(int days, int surcharge);
}