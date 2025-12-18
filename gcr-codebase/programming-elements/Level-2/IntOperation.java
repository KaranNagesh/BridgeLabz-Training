import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {

        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Take input values for a, b, and c
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Perform integer operations following operator precedence
        int result1 = a + b * c;   // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;   // Multiplication (*) evaluated before addition (+)
        int result3 = c + a / b;   // Division (/) evaluated before addition (+)
        int result4 = a % b + c;   // Modulus (%) evaluated before addition (+)

        // Print the results in the required output format
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

    }
}
