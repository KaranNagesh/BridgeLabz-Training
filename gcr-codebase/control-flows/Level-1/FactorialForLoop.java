import java.util.Scanner;
public class FactorialForLoop{
	public static void main(String[] args){
		
		//Scanner object is created to take input
		Scanner sc = new Scanner(System.in);
		
		//Getting number from user
		int number = sc.nextInt();
		
		//initialize factorial as 1 for default
		int factorial = 1;
		
		//Iterating till the user's given number and multiplying
		for(int i = 1 ; i <= number ; i++){
			factorial *= i;
		}
		
		//Printing the final factorial result
		System.out.println(factorial);
	}
}