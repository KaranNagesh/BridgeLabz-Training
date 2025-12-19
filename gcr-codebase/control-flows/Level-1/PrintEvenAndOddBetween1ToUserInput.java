import java.util.Scanner;
public class PrintEvenAndOddBetween1ToUserInput{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		if(number >= 0){
		while(number !=0 ){
			if(number % 2 == 0){
				System.out.println("Number is even : " +number);
				number--;
			}
			else{
				System.out.println("Number is odd : "+number);
				number--;
			}
		}
		}else{
			System.out.println("Number is not a natural number");
		}
			input.close();
		}
	}