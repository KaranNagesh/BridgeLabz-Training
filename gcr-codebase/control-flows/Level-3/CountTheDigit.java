import java.util.Scanner;

public class CountTheDigit {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking input number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int count = 0;

        // Special case: if number is 0, it has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Loop to count digits
            while (number != 0) {
                number = number / 10; // Remove last digit
                count++;              // Increment digit count
            }
        }

        // Print result
        System.out.println("Count of digits in the number is: " + count);

       
    }
}
