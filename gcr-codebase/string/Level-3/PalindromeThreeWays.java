import java.util.Scanner;

public class PalindromeThreeWays {

    // LOGIC 1: Iterative method using start and end index
    public static boolean isPalindromeIterative(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // LOGIC 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Character mismatch
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to reverse a string using charAt()
    public static char[] reverseString(String text) {

        int length = text.length();
        char[] reverse = new char[length];
        int index = 0;

        for (int i = length - 1; i >= 0; i--) {
            reverse[index] = text.charAt(i);
            index++;
        }

        return reverse;
    }

    // LOGIC 3: Palindrome check using character arrays
    public static boolean isPalindromeUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();

        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeUsingArray(text);

        System.out.println("\nLogic 1 (Iterative Method):");
        System.out.println(result1 ? "Palindrome" : "Not a Palindrome");

        System.out.println("\nLogic 2 (Recursive Method):");
        System.out.println(result2 ? "Palindrome" : "Not a Palindrome");

        System.out.println("\nLogic 3 (Character Array Method):");
        System.out.println(result3 ? "Palindrome" : "Not a Palindrome");
    }
}
