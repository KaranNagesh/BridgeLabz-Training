import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;   // Division operator
        int remainder = number % divisor;  // Modulus operator

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        int number = sc.nextInt();
        int divisor = sc.nextInt();

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed");
        } else {

            // Call method
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display result
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        sc.close();
    }
}
