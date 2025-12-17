import java.util.*;
class KmToMiles{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);
		
		// Getting distance in kilometers from the user
		double kilometer = sc.nextInt();
		
		// Converting kilometers to miles using conversion factor
		double miles = kilometer * 0.6;
		
		// Displaying the converted distance in miles
		System.out.println("The total miles is " + miles + " mile for the given " + kilometer + "km");
	}
}