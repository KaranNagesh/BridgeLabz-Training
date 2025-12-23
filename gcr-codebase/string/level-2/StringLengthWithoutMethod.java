import java.util.Scanner;

public class StringLengthWithoutMethod {

    // Method to find string length without using length()
    public static int findStringLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count); // access character at index
                count++;
            }
        } catch (Exception e) {
            // Exception occurs when index goes out of bounds
        }

        return count;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = findStringLength(input);
        int builtInLength = input.length();

        System.out.println("Length without using length(): " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        sc.close();
    }
}
