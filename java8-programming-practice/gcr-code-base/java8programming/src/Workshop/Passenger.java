package Workshop;


public class Passenger {

	private String route; // Route taken
	private double fare; // Fare paid
	private boolean peakTime; // Peak or non-peak

	public Passenger(String route, double fare, boolean peakTime) {
		this.route = route;
		this.fare = fare;
		this.peakTime = peakTime;
	}

	public String getRoute() {
		return route;
	}

	public double getFare() {
		return fare;
	}

	public boolean isPeakTime() {
		return peakTime;
	}
}