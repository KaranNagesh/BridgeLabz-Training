package StreamAPI.insuranceclaimanalysis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
	       List<Claim> claims = Arrays.asList(
	                new Claim("Health", 50000),
	                new Claim("Health", 75000),
	                new Claim("Vehicle", 30000),
	                new Claim("Vehicle", 45000),
	                new Claim("Life", 100000)
	        );

	        System.out.println("\n===== Average Claim Amount =====");

	        Map<String, Double> avgClaim =
	                claims.stream()
	                        .collect(Collectors.groupingBy(
	                                Claim::getType,
	                                Collectors.averagingDouble(Claim::getAmount)
	                        ));

	        avgClaim.forEach((k, v) ->
	                System.out.println(k + " → " + v));

	}
}
