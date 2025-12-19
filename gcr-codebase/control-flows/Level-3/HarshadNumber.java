import java.util.Scanner;
public class HarshadNumber{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		//Taking input form the user to find the number is Harshad Number or not
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		int sum = 0;
		int value = 0;
		int n = number;
		// using while loop 
		while(number != 0){
			sum = number %10;
			number = number / 10;
			value = value + sum;
		}
		
		if(n % value == 0){
			System.out.println("Number is Harshad Number: " +n);
		}
		else{
			System.out.println("Number is not a Harshad Number: " +n);
		}
		input.close();
	}
}
		