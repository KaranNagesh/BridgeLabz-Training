//Write a program to check for the natural number and the sum of n natural numbers 
import java.util.Scanner;
public class SumOfNaturalNumber{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		//Taking number as a input
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		//Using the if else condition to check the number is natural or not
		if(number >= 0){
			int sum = number * (number+1) / 2 ;
			System.out.println("The sum of " +number+ " natural numbers is " +sum);
		}
            else{
					System.out.println("The number "+ number+ " is not a natural number");
			}
	}
}