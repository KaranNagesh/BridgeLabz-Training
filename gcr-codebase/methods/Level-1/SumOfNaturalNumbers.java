import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate sum using loop
    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        int n = sc.nextInt();

        // Check for natural number
        if (n > 0) {
            int result = findSum(n);
            System.out.println("Sum of " + n + " natural numbers is: " + result);
        } else {
            System.out.println("Please enter a natural number");
        }

        sc.close();
    }
}
