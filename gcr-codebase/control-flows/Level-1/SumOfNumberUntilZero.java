import java.util.Scanner;
public class SumOfNumberUntilZero{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double total = 0.0;
		System.out.print("Enter the value : ");
		double value = input.nextInt();
		double sum = 0;
		while(value != 0){
			sum = sum + value;
			System.out.print("Enter the value : ");
			value = input.nextInt();
		}
		System.out.println("The total sum is : " +sum);
	}
}
		