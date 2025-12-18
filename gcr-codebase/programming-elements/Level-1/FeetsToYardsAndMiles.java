import java.util.Scanner;
public class FeetsToYardsAndMiles{
	public static void main(String[] args){
		
		//Creating Scanner object to read input values
		Scanner sc = new Scanner(System.in);
		
		// Getting the value in feets
		double feets = sc.nextDouble();
		
		// converting the value from feets to yards
		double yards = feets / 3;
		
		// converting the value from yards to miles
		double miles = yards / 1760;
		
		// Displaying the values in feets, yards and miles.
		System.out.println("Your length in feet is " + feets + " while in yards " + yards + " and mile is " + miles);
	}
}