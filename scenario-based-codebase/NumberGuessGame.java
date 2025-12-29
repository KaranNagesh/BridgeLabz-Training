import java.util.*;

public class NumberGuessGame{
	public static void main(String[] args){
		int num = 1 + (int) (Math.random() * (100 - 1 + 1));
		int guess = 0;
		Scanner sc = new Scanner(System.in);
		
		//counter for while loop
		int counter = 5;
		
		//Iterating throw while loop 5 times
		while(counter > 0){
			System.out.println("Enter a number : ");
			guess = sc.nextInt();
			if(guess > num){
				System.out.println("Too high");
			} else if(guess < num){
				System.out.println("Too low");
			} if(guess == num){
				System.out.println("You guessed it right");
				break;
			}
			counter--;
		}
		
	}
}