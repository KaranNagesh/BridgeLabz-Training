import java.util.Scanner;

public class LexicographicalCompare {

    // Method to compare two strings lexicographically
    public static void compareStrings(String s1, String s2) {

        // Find minimum length
        int minLen = Math.min(s1.length(), s2.length());

        // Compare characters one by one
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
                return;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
                return;
            }
        }

        // If all characters are same, compare lengths
        if (s1.length() < s2.length()) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
        } else if (s1.length() > s2.length()) {
            System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
        } else {
            System.out.println("Both strings are equal");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        compareStrings(s1, s2);

        sc.close();
    }
}
