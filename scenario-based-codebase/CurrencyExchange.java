import java.util.Scanner;
public class CurrencyExchange{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		//using do while loop because we want our code to run atleast one time
		do{
			System.out.print("Enter the currency in INR : ");
			double inr = sc.nextInt();
			
			//Menu for converter app
			System.out.println("Enter 1. for Converting into USD");
			System.out.println("Enter 2. for Converting into Pounds");
			System.out.println("Enter 3. for Converting into Euros");
			System.out.println("Enter 4. for Converting into Dhiram");
			System.out.println("Enter 5. for Converting into yen");
			int convert = sc.nextInt();
			
			//Using switches to convert to the different currency
			switch(convert){
				case 1 : 
				double usd = inr * 0.1113;
				System.out.println(inr + "INR in USD is " + usd);
				break;
				
				case 2 : 
				double pounds = inr * 0.0083;
				System.out.println(inr + "INR in Pounds is " + pounds);
				break;
				
				case 3 : 
				double euros = inr * 0.0095;
				System.out.println(inr + "INR in euros is " + euros);
				break;
				
				case 4 : 
				double dhiram = inr * 0.041;
				System.out.println(inr + "INR in dhiram is " + dhiram);
				break;
				
				case 5 : 
				double yen = inr * 1.74;
				System.out.println(inr + "INR in yen is " + yen);
				break;
				
				default :
				System.out.println("Entered an invalid input");
				
			}
			
				//Asking users again want to convert again or not 
				System.out.println();
				System.out.println("Do you want to convert again 1 for yes and 0 for no?");
				int again = sc.nextInt();
				if(again == 0){
					break;
				} else if(again == 1){
					continue;
				} else{
					System.out.println("Entered invalid option exiting");
					break;
				}
			
		}while(true);
	}
}