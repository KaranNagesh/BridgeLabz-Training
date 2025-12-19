import java.util.Scanner;

public class MultiplesBelowHundredUsingWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Check conditions
        if (number > 0 && number < 100) {

            System.out.print("Multiples of " + number + " below 100 are: ");
			
			int i = 100;
            // Backward while loop from 100 to 1
            while(i >= 1) {

                // Check if i is a multiple of number and below 100
                if (i < 100 && i % number == 0) {
                    System.out.println(i);
                }
				i--;
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }
    input.close();
    }
}
