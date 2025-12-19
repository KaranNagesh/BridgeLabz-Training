import java.util.Scanner;
public class PrimeNumber{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		//Taking input from the user
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		int count = 0;
		// using for loop find the number is prime or not
		for(int i=1; i<=number; i++){
			if(number % i == 0){
				count++;
				if(count > 2){
					break;
				}
			}
			else{
				continue;
			}
		}
		// print the number is prime or not
		if(count == 2){
			System.out.println("Number is prime : " +number);
		}
		else{
			System.out.println("Number is not a prime : " +number);
		}
	}
}
	