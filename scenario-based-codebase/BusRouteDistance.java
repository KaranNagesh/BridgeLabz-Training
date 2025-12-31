import java.util.Scanner;

public class BusRouteDistance{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//one array for stops and one array for distance
		String stops[] = {"Patel Nagar" , "Anand Nagar" , "Ratnagiri" , "Piplani" , "Indrapuri" , "JK road" , " ITI" , "Prabhat" , " Subhash Phatak " , "DB city"};
		int distance[] = {0,2,3,5,6,7,9,11,13,16,17};
		
		int travelDistance = 0;
		int i = 1;
		System.out.println("Bus is starting from " + stops[0]);
		
		//using while loop iterate from one stop to last
		while(true){
			System.out.println();
			System.out.println(stops[i] + " Stop do you want to go ?");
			System.out.println("1 for yes and 0 for no");
			int out = sc.nextInt();
			if(out == 1){
				travelDistance = distance[i];
				break;
			}
			if(i==stops.length){
				System.out.println("You have reached to the last stop you have to get off");
				break;
			}
			i++;
		}
		System.out.println();
		System.out.println("You have travelled " + travelDistance + "km total");
		System.out.println("Thanks for travelling with us");
		System.out.println();
	}
}