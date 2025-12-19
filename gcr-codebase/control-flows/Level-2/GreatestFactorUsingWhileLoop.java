import java.util.Scanner;

public class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number > 1) {

            int greatestFactor = 1;
            int counter = number - 1;
            // while Loop from number - 1 to 1
            while(counter >= 1) {

                // Check perfect divisibility
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;	
                }
				counter--;
            }

            // Display result
            System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);

        } else {
            System.out.println("Please enter an integer greater than 1.");
        }

        
    }
}
