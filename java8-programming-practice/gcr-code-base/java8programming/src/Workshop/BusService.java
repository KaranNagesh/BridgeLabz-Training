package Workshop;

public class BusService implements TransportService {

	public String getServiceName() {
		return "City Bus";
	}

	public String getRoute() {
		return "A → B";
	}

	public double getFare() {
		return 25.0;
	}

	public String getDepartureTime() {
		return "08:30";
	}
}