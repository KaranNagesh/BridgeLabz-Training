import java.util.Scanner;

public class FibonacciSeries {

    // Method to generate Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        generateFibonacci(terms);

        scanner.close();
    }
}
