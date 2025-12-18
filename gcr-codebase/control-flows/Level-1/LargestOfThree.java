import java.util.Scanner;
public class LargestOfThree{
	public static void main(String[] args){
		//Created a scanner object 
		Scanner sc = new Scanner(System.in);
		
		// Getting number1, number2, number3 from the user
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		//Checking the largest among all and print
		if(number1 > number2 && number1 > number3){
			System.out.println("First number " + number1 + " is the largest");
		} else if(number2 > number1 && number2 > number3){
			System.out.println("Second number " + number2  +" is the largest");
		} else{
			System.out.println("third number " + number3 + " is the largest");
		}
	}
}