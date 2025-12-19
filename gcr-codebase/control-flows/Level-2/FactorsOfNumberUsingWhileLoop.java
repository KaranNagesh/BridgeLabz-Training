import java.util.Scanner;

public class FactorsOfNumberUsingWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number > 0) {

            System.out.println("Factors of " + number + " are:");

            // while from 1 to less than number
			int i=1;
            while(i <= number) {
                // Check perfect divisibility
                if (number % i == 0) {
                    System.out.println(i);
					i++;
                }
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

    }
}
