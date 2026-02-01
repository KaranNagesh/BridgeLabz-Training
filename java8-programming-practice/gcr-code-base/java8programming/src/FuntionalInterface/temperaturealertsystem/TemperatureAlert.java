package FuntionalInterface.temperaturealertsystem;

import java.util.function.Predicate;

public class TemperatureAlert {
	public static void main(String[] args) {
		double threshould = 38.0;
		
		Predicate<Double> hightemperature = temp -> temp > threshould;
		
		double currenttemp = 39.5;
		
		if(hightemperature.test(currenttemp)) {
			System.out.println("Temperature is too high");
		} else {
			System.out.println("Temperature is normal");
		}
	}
}
