import java.util.Scanner; 

public class QuotientAndRemainder {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read first number from the user
        int number1 = sc.nextInt();

        // Read second number from the user
        int number2 = sc.nextInt();

        // Calculate quotient using division operator
        int quotient = number1 / number2;

        // Calculate remainder using modulus operator
        int remainder = number1 % number2;

        // Display the result in the required format
        System.out.println("The Quotient is " + quotient +
                " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2);

    }
}
