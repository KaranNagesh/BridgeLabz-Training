import java.util.Scanner;

public class SumOfNaturalNumbersComparison {

    // Method to find sum using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;              // Base case
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        int n = sc.nextInt();

        // Check for natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number");
            sc.close();
            return;
        }

        // Calculate sums
        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal");
        } else {
            System.out.println("Results are not equal");
        }

        sc.close();
    }
}
