import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		// Take input between 6 to 9
		System.out.print("Enter the number between 6 to 9 : ");
		int number = input.nextInt();
		int table = 1;
		// using for loop we can print all the table
		for(int i=1; i<=10; i++){
			table = number * i;
			System.out.println(+number+ " * " +i+ " = " +table);
		}
	}
}
			