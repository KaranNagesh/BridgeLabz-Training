import java.util.Scanner;
public class Factor{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		int factor = 1;
		int num = number;
		//Using while loop to calculate the factorial
		while(number != 0){
			factor = factor * number;
			number--;
		}
		System.out.print("The factorial of " +num+ " which is " +factor);
		
	}
}	