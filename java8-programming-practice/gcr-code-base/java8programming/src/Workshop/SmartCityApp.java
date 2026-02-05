package Workshop;


import java.util.*;
import java.util.stream.*;

public class SmartCityApp {

	public static void main(String[] args) {

		// Creating transport services
		List<TransportService> services = Arrays.asList(new BusService(), new MetroService(), new TaxiService(),
				new AmbulanceService());

		// Lambda: Filter cheap services and sort by time
		System.out.println("Filtered & Sorted Services:");
		services.stream().filter(s -> s.getFare() <= 50) // Lambda filtering
				.sorted(Comparator.comparing(TransportService::getDepartureTime)) // Method reference
				.forEach(TransportService::printServiceDetails); // forEach display

		// Emergency service detection using marker interface
		System.out.println("\nEmergency Check:");
		services.forEach(s -> {
			if (s instanceof EmergencyService) {
				System.out.println(s.getServiceName() + " has PRIORITY access");
			}
		});

		// Functional Interface using Lambda
		FareCalculator taxiFareCalc = d -> 50 + (d * 15); // Lambda implementation
		System.out.println("\nTaxi Fare for 10km: ₹" + taxiFareCalc.calculateFare(10));

		// Static method usage
		double distance = GeoUtils.calculateDistance(2, 3, 7, 8); // Static interface method
		System.out.println("\nCalculated Distance: " + distance);

		// Passenger data
		List<Passenger> passengers = Arrays.asList(new Passenger("A → B", 25, true), new Passenger("A → B", 25, false),
				new Passenger("C → D", 40, true), new Passenger("C → D", 40, false),
				new Passenger("Door-to-Door", 120, true));

		// groupingBy route
		Map<String, List<Passenger>> byRoute = passengers.stream().collect(Collectors.groupingBy(Passenger::getRoute));

		System.out.println("\nPassengers Grouped By Route:");
		byRoute.forEach((k, v) -> System.out.println(k + " -> " + v.size()));

		// partitioningBy peak time
		Map<Boolean, List<Passenger>> peakPartition = passengers.stream()
				.collect(Collectors.partitioningBy(Passenger::isPeakTime));

		System.out.println("\nPeak Trips: " + peakPartition.get(true).size());
		System.out.println("Non-Peak Trips: " + peakPartition.get(false).size());

		// summarizingDouble for revenue
		DoubleSummaryStatistics stats = passengers.stream().collect(Collectors.summarizingDouble(Passenger::getFare));

		System.out.println("\nTotal Revenue: ₹" + stats.getSum());
		System.out.println("Average Fare: ₹" + stats.getAverage());

		// Live dashboard simulation
		System.out.println("\nLive Dashboard:");
		services.forEach(s -> System.out.println("LIVE: " + s.getServiceName() + " on " + s.getRoute()));
	}
}