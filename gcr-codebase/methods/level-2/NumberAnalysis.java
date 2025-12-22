import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if number is positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if number is even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    // returns 1 if number1 > number2
    // returns 0 if both are equal
    // returns -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Take input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];
            System.out.print(num + " -> ");

            if (isPositive(num)) {
                System.out.print("Positive, ");

                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparison of first and last element:");

        if (result == 1) {
            System.out.println("First element is greater than last element");
        } else if (result == -1) {
            System.out.println("First element is less than last element");
        } else {
            System.out.println("First and last elements are equal");
        }

        sc.close();
    }
}
