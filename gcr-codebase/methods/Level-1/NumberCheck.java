import java.util.Scanner;

public class NumberCheck {

    // Method to check the number
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;      // Positive number
        } else if (num < 0) {
            return -1;     // Negative number
        } else {
            return 0;      // Zero
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        int number = sc.nextInt();

        // Call method
        int result = checkNumber(number);

        // Display result
        if (result == 1) {
            System.out.println("Positive number");
        } else if (result == -1) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
