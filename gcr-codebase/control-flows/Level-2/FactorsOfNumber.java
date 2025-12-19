import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number > 0) {

            System.out.println("Factors of " + number + " are:");

            // Loop from 1 to less than number
            for (int i = 1; i < number; i++) {

                // Check perfect divisibility
                if (number % i == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

    }
}
