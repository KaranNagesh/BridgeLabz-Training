import java.util.Scanner;
public class CountDown{
	 
	public static void main(String args[]){
		
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the value of counter :");
    int counter = input.nextInt();
	// Using the while loop to print all the counter value form counter to 1
	while(counter != 0){
		System.out.println("counter value : " +counter);
		counter--;
	}
	}
}
	
    