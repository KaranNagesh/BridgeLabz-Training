import java.util.Scanner;

public class MaximumOfThree {

    // Method to find maximum of three numbers
    public static int findMaximum(int first, int second, int third) {
        int max = first;

        if (second > max) max = second;
        if (third > max) max = third;

        return max;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("Maximum number is: " + findMaximum(num1, num2, num3));

        scanner.close();
    }
}
