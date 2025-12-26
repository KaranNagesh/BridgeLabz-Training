import java.util.Scanner;

public class PalindromeChecker {

    // Method to check palindrome
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        if (isPalindrome(inputText))
            System.out.println("It is a palindrome.");
        else
            System.out.println("It is not a palindrome.");

        scanner.close();
    }
}
