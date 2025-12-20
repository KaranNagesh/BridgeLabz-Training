import java.util.Scanner;

public class TemperatureAndWindSpeed{
	
	// Method  to find the windchill by formula
	public double calculateWindChill(double temperature , double windSpeed){
		double windChill = 34.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed,0.16);
		return windChill;
	}
	
	public static void main(String[] args){
		TemperatureAndWindSpeed temperatureAndWindSpeed = new TemperatureAndWindSpeed();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature :");
		double temperature = sc.nextDouble();
		
		System.out.println("Enter the WindSpeed :");
		double windSpeed = sc.nextDouble();
		
		double windChill =  temperatureAndWindSpeed.calculateWindChill(temperature,windSpeed);
	
		System.out.println("The windchill is " + windChill);
	}
}