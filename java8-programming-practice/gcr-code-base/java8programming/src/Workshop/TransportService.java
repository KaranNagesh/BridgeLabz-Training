package Workshop;

public interface TransportService {

	String getServiceName(); // Returns service name

	String getRoute(); // Returns route details

	double getFare(); // Returns fare

	String getDepartureTime(); // Returns departure time

	default void printServiceDetails() { // Default method
		System.out.println(getServiceName() + " | Route: " + getRoute() + " | Fare: ₹" + getFare() + " | Time: "
				+ getDepartureTime());
	}
}