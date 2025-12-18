import java.util.Scanner;

public class SumInForLoop{
	public static void main(String[] args){
		//Created a scanner object to take input
		Scanner sc = new Scanner(System.in);
		
		//Initialized the total as 0
		double total = 0;
		
		//Getting the input number from user
		double number = sc.nextInt() ;
		
		//Infinite while loop
		while(true){
			//adding in total
			total = total + number;	
			
			//again getting input for user 
			number = sc.nextInt();
			
			//condition of getting out or whileloop
			if(number == 0){
				break;
			}
		}
		System.out.println("the total value is " + total);
	}
}