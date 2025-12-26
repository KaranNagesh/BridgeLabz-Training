import java.util.Scanner;

public class RemoveSpecificCharacter {

    // Method to remove all occurrences of a character
    public static String removeCharacter(String text, char ch) {
        String result = "";

        // Traverse the string
        for (int i = 0; i < text.length(); i++) {

            // Append character only if it is not equal to ch
            if (text.charAt(i) != ch) {
                result += text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        System.out.println("Modified String: " + removeCharacter(text, ch));

        sc.close();
    }
}
