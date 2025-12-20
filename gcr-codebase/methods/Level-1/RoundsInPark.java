import java.util.Scanner;

public class RoundsInPark{
	
	//method to com=nvert meter to kilometer
	public double meterToKilometer(double meter){
		return meter/1000;
	}
	
	//method to find perimeterOfTriangle
	public double perimeterOfTriangle(double side1 , double side2, double side3){
		return side1 + side2 + side3 ;
	}
	
	//method of calculating numher of rounds
	public double calculatingRound(double perimeter){
		return 5/perimeter;
	}
	
	public static void main(String[] args){
		RoundsInPark roundsInPark = new RoundsInPark();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of a side 1 of traingular park in meter");
		double side1 = sc.nextDouble();
		
		System.out.println("Enter the length of a side 2 of traingular park in meter");
		double side2 = sc.nextDouble();
		
		System.out.println("Enter the length of a side 3 of traingular park in meter");
		double side3 = sc.nextDouble();
		
		//converting meter to kilometer first
		double side1InKm = roundsInPark.meterToKilometer(side1);
		double side2InKm = roundsInPark.meterToKilometer(side2);
		double side3InKm = roundsInPark.meterToKilometer(side3);
		
		//calculating perimeter by calling methor and passing sides
		double perimeter = roundsInPark.perimeterOfTriangle(side1InKm,side2InKm,side3InKm);
		
		//calculating the required round by method passing perimeter
		double round = roundsInPark.calculatingRound(perimeter);
		
		//displaying the results
		System.out.println("The athelet needs " + round + " rounds to complete 5km");
	}
}