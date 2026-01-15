package ambulanceroute;

public class Main {
	public static void main(String[] args) {

		// Create the ambulance route
		AmbulanceRoute route = new AmbulanceRoute();

		// Add hospital units to the route
		route.addUnit("Emergency", false);
		route.addUnit("Radiology", false);
		route.addUnit("Surgery", true);
		route.addUnit("ICU", false);

		// Display current route
		route.displayRoute();

		// Simulate ambulance arrival
		System.out.println("\nAmbulance arriving...");
		route.findAvailableUnit();

		// Remove Surgery unit due to maintenance
		System.out.println("\nSurgery under maintenance");
		route.removeUnit("Surgery");

		// Display updated route
		route.displayRoute();

		// Simulate ambulance arrival again
		System.out.println("\nAmbulance arriving again...");
		route.findAvailableUnit();
	}
}
