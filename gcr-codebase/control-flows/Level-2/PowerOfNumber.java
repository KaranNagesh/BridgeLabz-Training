import java.util.Scanner;
public class PowerOfNumber{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// Taking power and number as a input
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		
		System.out.print("Enter the power : ");
		int power = input.nextInt();
		
		int result = 1;
		//using for loop 
		for(int i=0; i<power; i++){
			result = result * number;
		}
		
		System.out.println("The result is : " +result);
	}
}