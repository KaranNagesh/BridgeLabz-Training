import java.util.Scanner;
public class SumOfNaturalNumberAndCompare{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		//Take input from the user
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		// find the sum by formula
		int resultFromFormula = number*(number+1)/2;
		
		// Find the sum by using while loop
		int sum = 0;
		if(number >= 0){
			while(number != 0){
				sum = sum + number;
				number--;
			}
			if(sum == resultFromFormula){
			System.out.println("Both the result are same : "+sum);
		}
			
		}
		else{
			System.out.println("Number is not a natural number");
		}
		
		
		input.close();
	}
}

	
		