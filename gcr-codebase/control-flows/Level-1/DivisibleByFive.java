import java.util.Scanner;
public class DivisibleByFive{
	public static void main(String[] args){
		
		//Create a Scanner Object
		Scanner sc = new Scanner(System.in);
		
		//Getting input value for number
		int number = sc.nextInt();
		
		//Checking the number is divisible by 5 or not and printing either divisible or not divisible
		if( number % 5 == 0) {
			System.out.println("The number " + number + " is divisible by 5");
		} else {
			System.out.println("The number " + number + " is not divisible by 5");

		}
	}
}