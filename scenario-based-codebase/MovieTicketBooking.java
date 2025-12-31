import java.util.Scanner;

public class MovieTicketBooking{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//loop will run untill user exits
		while(true){
		int priceMovieType ;
		int priceSeatType;
		int priceSnacks;
		int seatType;
		int totalBill = 0;
		
		    //Menu or homepage for movie booking
			System.out.println("Welcome to the movie ticket booking APP !!");
			System.out.println("Select your movie type.");
			System.out.println("1. for Action");
			System.out.println("2 for Comedy");
			System.out.println("3 for Romance");
			System.out.println("4 for Sci-Fi");
			int movieType = sc.nextInt();
			switch(movieType){
				case 1 : 
					System.out.println("You selected Action type");
					System.out.println("Select seat type");
					System.out.println("1. for gold $200");
					System.out.println("2. for silver $150");
					seatType = sc.nextInt();
					if(seatType == 1 ){
						totalBill += 200;
						System.out.println("Do you want to add snacks ? $50");
						System.out.println("1. for yess");
						System.out.println("2. for no");
						int snacks = sc.nextInt();
						if(snacks == 1){
							totalBill += 50;
							
							System.out.println("Your total bill of action movie , Seat type : gold , with snacks is " + totalBill);
							
						}  else {
							System.out.println("Your total bill of action movie , Seat type : gold , without snacks is " + totalBill);
							
						}
						} else if(seatType == 2){
						totalBill += 150;
						System.out.println("Do you want to add snacks ? $50");
						System.out.println("1. for yess");
						System.out.println("2. for no");
						int snacks = sc.nextInt();
						if(snacks == 1){
							totalBill += 50;
							
							System.out.println("Your total bill of action movie , Seat type : Silvers , with snacks is " + totalBill);
							
						}  else {
							System.out.println("Your total bill of action movie , Seat type : Silvers , without snacks is " + totalBill);
							
						}	
						}
						
						break;
				case 2 : 
					System.out.println("You selected Comedy type");
					System.out.println("Select seat type");
					System.out.println("1. for gold $200");
					System.out.println("2. for silver $150");
					seatType = sc.nextInt();
					if(seatType == 1 ){
						totalBill += 200;
						System.out.println("Do you want to add snacks ? $50");
						System.out.println("1. for yess");
						System.out.println("2. for no");
						int snacks = sc.nextInt();
						if(snacks == 1){
							totalBill += 50;
							
							System.out.println("Your total bill of comedy movie , Seat type : gold , with snacks is " + totalBill);
							
						}  else {
							System.out.println("Your total bill of comedy movie , Seat type : gold , without snacks is " + totalBill);
							
						}
						} else if(seatType == 2){
						totalBill += 150;
						System.out.println("Do you want to add snacks ? $50");
						System.out.println("1. for yess");
						System.out.println("2. for no");
						int snacks = sc.nextInt();
						if(snacks == 1){
							totalBill += 50;
							
							System.out.println("Your total bill of comedy movie , Seat type : Silvers , with snacks is " + totalBill);
							
						}  else {
							System.out.println("Your total bill of comedy movie , Seat type : Silvers , without snacks is " + totalBill);
							
						}	
						}
						
						break;
						case 3 :
						System.out.println("You selected Romance type");
					System.out.println("Select seat type");
					System.out.println("1. for gold $200");
					System.out.println("2. for silver $150");
					seatType = sc.nextInt();
					if(seatType == 1 ){
						totalBill += 200;
						System.out.println("Do you want to add snacks ? $50");
						System.out.println("1. for yess");
						System.out.println("2. for no");
						int snacks = sc.nextInt();
						if(snacks == 1){
							totalBill += 50;
							
							System.out.println("Your total bill of Romance movie , Seat type : gold , with snacks is " + totalBill);
							
						}  else {
							System.out.println("Your total bill of Romance movie , Seat type : gold , without snacks is " + totalBill);
							
	                    }
						} else if(seatType == 2){
						totalBill += 150;
						System.out.println("Do you want to add snacks ? $50");
						System.out.println("1. for yess");
						System.out.println("2. for no");
						int snacks = sc.nextInt();
						if(snacks == 1){
							totalBill += 50;
							
							System.out.println("Your total bill of Romance movie , Seat type : Silvers , with snacks is " + totalBill);
							
						}  else {
							System.out.println("Your total bill of Romance movie , Seat type : Silvers , without snacks is " + totalBill);
							
						}	
						}
						
						break;
						
						case 4 : 
						System.out.println("You selected Sci-fi type");
					System.out.println("Select seat type");
					System.out.println("1. for gold $200");
					System.out.println("2. for silver $150");
					seatType = sc.nextInt();
					if(seatType == 1 ){
						totalBill += 200;
						System.out.println("Do you want to add snacks ? $50");
						System.out.println("1. for yess");
						System.out.println("2. for no");
						int snacks = sc.nextInt();
						if(snacks == 1){
							totalBill += 50;
							
							System.out.println("Your total bill of Sci-fi movie , Seat type : gold , with snacks is " + totalBill);
							
						}  else {
							System.out.println("Your total bill of Sci-fi movie , Seat type : gold , without snacks is " + totalBill);
							
						}
						} else if(seatType == 2){
						totalBill += 150;
						System.out.println("Do you want to add snacks ? $50");
						System.out.println("1. for yess");
						System.out.println("2. for no");
						int snacks = sc.nextInt();
						if(snacks == 1){
							totalBill += 50;
							
							System.out.println("Your total bill of Sci-fi movie , Seat type : Silvers , with snacks is " + totalBill);
							
						}  else {
							System.out.println("Your total bill of Sci-fi movie , Seat type : Silvers , without snacks is " + totalBill);
							
						}	
						}
						
						break;
					}
			
            //Asking user they want to book ticket again or not			
			System.out.println("Do you want to book ticket again ?");
			System.out.println("1. for yess");
			System.out.println("2. for no");
			int again = sc.nextInt();
			if(again == 2 ){
				break;
			} 
			}
			
		}
	}

