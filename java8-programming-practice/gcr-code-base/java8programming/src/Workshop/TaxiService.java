package Workshop;


public class TaxiService implements TransportService {

	public String getServiceName() {
		return "Taxi";
	}

	public String getRoute() {
		return "Door-to-Door";
	}

	public double getFare() {
		return 120.0;
	}

	public String getDepartureTime() {
		return "Immediate";
	}
}