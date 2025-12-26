import java.util.Scanner;

public class GcdLcmCalculator {

    // Method to calculate GCD
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    // Method to calculate LCM
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("GCD: " + findGCD(num1, num2));
        System.out.println("LCM: " + findLCM(num1, num2));

        scanner.close();
    }
}
