import java.util.Scanner;

public class SandeepFitness{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the fitness tracker");
		int days[] =  new int[7];
		int total = 0;
		int workday = 0 ;
		int check ;
		int pushup;
		
		//Taking user input pushups per day
		for(int i = 0 ; i < days.length; i++){
			
			System.out.println("Enter 1 for workout day and 0 for the rest day");
			check = sc.nextInt();
			if(check == 1){
				System.out.print("Enter a number of push-ups of day-" + (i+1) +" : ");
				days[i] = sc.nextInt();
			} else if(check == 0){
				System.out.println("Rest day");
				days[i] =0;
				continue;
			} else{
				System.out.println("Wrong input we are taking it as a rest day");
				days[i] =0;
				continue;
			}
		}
		
		//iterating through the days and calculating the total days and workdays
		for(int i : days){
			if(i != 0){
				total += i;
				workday++;
			}
		}
		
		//Calculating average for workdays
		int average = total/workday;
		
		
		//Displaying the result
		System.out.println("You workout on " + workday + " days out of 7 this week");
		System.out.println("Your total workout for this week is : " + total);
		System.out.println("Your average pushups on workout days excluding rest days is : " + average);
	}
}