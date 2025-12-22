import java.util.Scanner;

public class NumberChecker3 {

    // Method to check Prime Number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check Neon Number
    // Neon number: sum of digits of square == number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check Spy Number
    // Spy number: sum of digits == product of digits
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check Automorphic Number
    // Automorphic: square ends with the number itself
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    // Method to check Buzz Number
    // Buzz number: divisible by 7 or ends with 7
    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Prime Number: " + isPrime(number));
        System.out.println("Neon Number: " + isNeonNumber(number));
        System.out.println("Spy Number: " + isSpyNumber(number));
        System.out.println("Automorphic Number: " + isAutomorphicNumber(number));
        System.out.println("Buzz Number: " + isBuzzNumber(number));

        sc.close();
    }
}
