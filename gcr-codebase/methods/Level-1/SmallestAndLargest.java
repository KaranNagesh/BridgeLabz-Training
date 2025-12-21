import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find smallest and largest numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;

        // Compare with second number
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }

        // Compare with third number
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Return result as array
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Call method
        int[] result = findSmallestAndLargest(num1, num2, num3);

        // Display result
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        sc.close();
    }
}
