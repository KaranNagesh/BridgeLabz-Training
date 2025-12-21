import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int chocolatesPerChild = number / divisor;   // Quotient
        int remainingChocolates = number % divisor;  // Remainder

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();

        // Check for valid number of children
        if (numberOfChildren <= 0) {
            System.out.println("Number of children must be greater than zero");
        } else {

            // Call method
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display result
            System.out.println("Each child gets " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        sc.close();
    }
}
