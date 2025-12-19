import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Read the number from user
        int num = sc.nextInt();

        // Variable to store sum of proper divisors
        int sum = 0;

        // Loop from 1 to num - 1 to find proper divisors
        for (int i = 1; i < num; i++) {

            // Check if i is a divisor of num
            if (num % i == 0) {
                sum += i;  // Add divisor to sum
            }
        }

        // Check Abundant Number condition
        // If sum of proper divisors is greater than the number
        if (sum > num) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
    }
}
