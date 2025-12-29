import java.util.Scanner;

public class Parking{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		//Car parking capacity
		int occupancy = 20;
		
		
		//Iterating throw while loop untill parking gets fill
		while( occupancy > 0 ){
			
			System.out.println("Menu");
			System.out.println("1 for park");
			System.out.println("2 for exit");
			System.out.println("3 for Show occupancy");
			
			//choice for switch case
			int choice = sc.nextInt();
			
			//Using switch case for checking the parking 
			switch (choice){
				
				//Case 1 for park a car and decrement occupancy
				case 1 : 
				if(occupancy <=20){
					System.out.println("Car parking succesfully");
				    occupancy--;
				}else{
					System.out.println("Parking is full");
				}
				
				break;
				
				//Case 2 for exiting car and increment occupancy
				case 2 : 
				if(occupancy > 0 && occupancy < 20){
					System.out.println("Exited car succesfully");
					occupancy++;
				} else {
					System.out.println("No car left for exit");
					
				}
				break;
				
				
				//case 3 for showing occupancy
				case 3 :
				System.out.println("Parking has " + occupancy + " Left");
				break;
				
				default:
				System.out.println("You are entering a wrong number");
				
			}
			System.out.println();
		}
	}
}