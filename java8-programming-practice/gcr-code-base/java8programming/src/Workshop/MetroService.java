package Workshop;

public class MetroService implements TransportService {

	public String getServiceName() {
		return "Metro";
	}

	public String getRoute() {
		return "C → D";
	}

	public double getFare() {
		return 40.0;
	}

	public String getDepartureTime() {
		return "08:00";
	}
}