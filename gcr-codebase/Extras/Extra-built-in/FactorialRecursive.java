import java.util.Scanner;

public class FactorialRecursive {

    // Recursive method to calculate factorial
    public static int factorial(int number) {
        if (number == 0)
            return 1;
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Factorial is: " + factorial(number));

        scanner.close();
    }
}
