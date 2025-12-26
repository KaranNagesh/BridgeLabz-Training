import java.util.Scanner;

public class PrimeChecker {

    // Method to check if number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number))
            System.out.println("Number is prime.");
        else
            System.out.println("Number is not prime.");

        scanner.close();
    }
}
