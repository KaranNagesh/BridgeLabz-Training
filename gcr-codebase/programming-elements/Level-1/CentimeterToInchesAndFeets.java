import java.util.*;
class CentimeterToInchesAndFeets{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);
		
		// Reading height in centimeters from the user
		double heightInCentimeter = sc.nextDouble();
		
		// Converting height from centimeters to inches
		double heightInInches = heightInCentimeter  / 2.54;
		
		// Converting height from inches to feet
		double heightInFeets = heightInInches / 12;
		
		// Displaying height in centimeters, feet, and inches
		System.out.println("Your Height in cm is " + heightInCentimeter +" while in feet is " + heightInFeets +"and inches is " + heightInInches);
	}
}