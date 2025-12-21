import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read the number from user
        int num = sc.nextInt();

        // Temporary variable to count digits
        int tempNum = num;
        int count = 0;

        // Count number of digits in the number
        while (tempNum != 0) {
            count++;
            tempNum = tempNum / 10; // Remove last digit
        }

        // Create array to store digits
        int arr[] = new int[count];

        // Store digits of number in reverse order
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num % 10;  // Get last digit
            num = num / 10;     // Remove last digit
        }

        // Print reversed number
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        // Close scanner
        sc.close();
    }
}
