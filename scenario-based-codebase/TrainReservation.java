import java.util.Scanner;

public class TrainReservation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Variable for checking the booked seats and vaccant seats
		int seats = 10;
		int occupied = 0;
		System.out.println("Welcome to train booking System !!");
		System.out.println();
		while(seats > 0){
			
			//Menu table displaying the user with options
			System.out.println();
			System.out.println("Menu");
			System.out.println("1 for ticket booking");
			System.out.println("2 for cancelling the ticket");
			System.out.println("3 for Showing the vaccant and occupied seats");
			System.out.println("4 for exiting the menu");
			
			System.out.println();
			System.out.println("Please enter the number");
			int choice = sc.nextInt();
			if(choice == 1 || choice == 2 || choice == 3 ){
			
			switch(choice){
				//booking ticket seats decrement and occupied seats increment
				case 1 : 
				occupied++;
				seats--;
				System.out.println("booking the ticket");
				System.out.println("Ticket booked successfully !! happyy journey <3");
				break;
				
				
				// cancelling ticket occupied seat decrement and vaccant increment
				case 2 : 
				if(seats > 10){
				seats++;
				occupied--;	
				System.out.println("Ticket cancelled successfully");
				} else{
					System.out.println("Dont have a ticket to cancel");
				}
				
				break;
				
				//Showing the vaccant seat and occupied seatss
				case 3 : 
				
				System.out.println("The number of vaccant seats are : " + seats);
				System.out.println("The number of occupied seats are : " + occupied);
				break;
			 }
		  } else if (choice == 4){
			  System.out.println();
			  System.out.println("Exiting from the train booking system");
			  break;
		  } else{
			  System.out.println();
			  System.out.println("Enter a valid number");
			  
		  }
		}
		
	}
}