import java.util.Scanner;

public class MultiplesBelowHundred {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Check conditions
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100 are:");

            // Backward loop from 100 to 1
            for (int i = 100; i >= 1; i--) {

                // Check if i is a multiple of number and below 100
                if (i < 100 && i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

    }
}
