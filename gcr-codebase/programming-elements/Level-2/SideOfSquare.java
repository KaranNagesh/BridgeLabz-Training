import java.util.Scanner;
public class SideOfSquare{
	public static void main(String[] args){
		
		// Creating Scanner object to read input
		Scanner sc = new Scanner(System.in);
		
		// Reading the perimeter of the square from the user
		int perimeter = sc.nextInt();
		
		// Calculating the length of one side of the square
		int side = perimeter / 4;
		
		// Displaying the side length and given perimeter
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
	}
}