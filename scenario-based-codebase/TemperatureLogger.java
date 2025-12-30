import java.util.Scanner;

public class TemperatureLogger{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Creating temperature array and taking input of day wise temperature
		int[] temperature = new int[7];
		for(int i = 0 ; i < temperature.length ; i++){
			System.out.print("Enter the temperature of day - " + (i+1) + ":");
			temperature[i] = sc.nextInt();
		}
		
		// max variable for storing max temperature and sum for adding all the temperatures
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		
		//Checking for the maximum temperature and calculating sum for finding the average
		for(int i = 0 ; i < temperature.length; i++){
			if(temperature[i] > max){
				max = temperature[i];
			}
			sum += temperature[i];
		}
		double average = sum / 7;
		
		
		//displaying the results
		System.out.println("The maximum temperature in these 7 days is " + max);
		System.out.println("The average temperature of these 7 days is " + average);
	}
}