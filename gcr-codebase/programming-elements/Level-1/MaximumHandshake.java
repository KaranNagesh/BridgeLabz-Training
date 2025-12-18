import java.util.Scanner;
public class MaximumHandshake{
	public static void main(String[] args){
		//Creating Scanner object to read input values
		Scanner sc = new Scanner(System.in);
		
		//Getting input of number of students from user
		int numberOfStudents = sc.nextInt();
		
		//Calculating the number of handshakes by formula
		int numberOfHanshakes = (numberOfStudents*(numberOfStudents-1))/2;
		
		//Displaying number of handshakes
		System.out.println(numberOfHanshakes);
	}
		
}