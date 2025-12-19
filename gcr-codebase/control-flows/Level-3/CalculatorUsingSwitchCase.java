import java.util.Scanner;
public class CalculatorUsingSwitchCase{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		// Taking input from the user for doing the operations
		System.out.print("Enter the first number : ");
		double first = input.nextDouble();
		System.out.print("Enter the operator like + , - , * , / :  ");
		char operator = input.next().charAt(0);
		System.out.print("Enter the second number : ");
		double second = input.nextDouble();
		
		double result = 0.0;
		// Using switch case to perform opertaions
		switch(operator){
			case '+':
			    result = first + second;
				break;
			case '-':
				result = first - second;
				break;
			case '*':
				result = first * second;
				break;
			case '/':
				if(second == 0){
				System.out.println("!Error divisible by zero is not possible");
				return;
			}
				result = first / second;
				break;
			// if the user enter the wrong operator	
			default :
				System.out.println("You enter unvalid operator");
				return;
		}
		// print the result
		System.out.println(first+ " " +operator+ " " +second+ " = " +result);
		input.close();
	}
}

			
			
			
		
		