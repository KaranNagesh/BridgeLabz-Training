import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number > 1) {

            int greatestFactor = 1;

            // Loop from number - 1 to 1
            for (int i = number - 1; i >= 1; i--) {

                // Check perfect divisibility
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }

            // Display result
            System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);

        } else {
            System.out.println("Please enter an integer greater than 1.");
        }

        
    }
}
