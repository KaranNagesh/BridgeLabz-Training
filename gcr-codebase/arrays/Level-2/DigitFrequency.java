import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Find the count of digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Array to store digits of the number
        int[] digits = new int[count];

        // Store digits in the array
        temp = number;
        int index = 0;
        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }

        // Frequency array for digits 0 to 9
        int[] frequency = new int[10];

        // Calculate frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
