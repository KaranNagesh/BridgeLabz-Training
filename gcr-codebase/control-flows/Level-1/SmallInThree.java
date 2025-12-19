import java.util.Scanner;
public class SmallInThree{
	
	public static void main(String argr[]){
		Scanner input = new Scanner(System.in);
		//Taking the three input 
		System.out.print("Enter the first number : ");
		double number1 = input.nextDouble();
		System.out.print("Enter the second number : ");
		double number2 = input.nextDouble();
		System.out.print("Enter the third number : ");
		double number3 = input.nextDouble();
		//Compair all the number by using if else conditions
		if(number1 < number2 && number1 < number3){
			System.out.println("Is the first number the smallest : " +number1);
		}
			else if(number2 < number3 && number2 < number1){
			System.out.println("Is the first number the smallest : " +number2);
			}
			else if(number3 < number2 && number3 < number1){
				System.out.println("Is the first number the smallest : " +number3);
			}
				else
					System.out.println("All the Number are same so, the smallest is : "+number1);
	}
}
			
			
			

		
		