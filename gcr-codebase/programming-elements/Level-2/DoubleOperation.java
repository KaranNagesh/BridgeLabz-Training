import java.util.Scanner;

public class DoubleOperation{
    public static void main(String[] args) {

        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Take input values for a, b, and c of double data type
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Perform double operations following operator precedence
        double result1 = a + b * c;   // Multiplication has higher precedence than addition
        double result2 = a * b + c;   // Multiplication evaluated before addition
        double result3 = c + a / b;   // Division evaluated before addition
        double result4 = a % b + c;   // Modulus evaluated before addition (works with double)

        // Print the results in the required output format
        System.out.println("The results of Double Operations are "  + result1 + ", "  + result2 + ", "  + result3 + ", and " + result4);

    }
}
