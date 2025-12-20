import java.util.Scanner;

public class Handshake{
	
	// Method for calculating numberOfHandshake
	public int numberOfHandshake(int n){
		return  (n * (n - 1)) / 2;
	}
	public static void main(String[] args){
		
		Handshake handshake = new Handshake();
		
		Scanner sc = new Scanner(System.in);
		
		//taking input as number of students
		int n = sc.nextInt();
		
		// passing the value of n in function and printing 
		System.out.println(handshake.numberOfHandshake(n));
		
		
	}
}