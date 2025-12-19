//program to check whether a number is positive, negative, or zero.
import java.util.Scanner;
public class FindTheNumberType{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		// Taking a input for checking the number type
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		//Check the number type by using the condition statement
		if(number > 0){
			System.out.println("Number is positive");
		}
		else if(number < 0){
			System.out.println("Number is negative");
		}
		else{
			System.out.println("Number is zero");
		}
	}
}

			
		
		