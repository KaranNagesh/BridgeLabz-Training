import java.util.Scanner;

public class CountdownInForLoop{
	public static void main(String[] args){
		
		// Created a scanner object to take input
		Scanner sc = new Scanner(System.in);
		
		//getting counter from user 
		int counter = sc.nextInt();
		
		//printing the counter and decrement it in every next life
		for(int i = counter ; i > 0 ;i--){
			System.out.println(i);
		}
	}
}