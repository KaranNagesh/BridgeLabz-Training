import java.util.Scanner;

public class FactorsOperations {

    // Method to find factors and return them as an array
    public static int[] findFactors(int number) {

        // First loop to count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array with factor count
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number");
            sc.close();
            return;
        }

        // Get factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println();

        // Calculate results
        int sum = findSum(factors);
        long product = findProduct(factors);
        double sumOfSquares = findSumOfSquares(factors);

        // Display results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        sc.close();
    }
}
