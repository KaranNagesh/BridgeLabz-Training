import java.util.Scanner;

public class SplitAndCompare {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string
        }
        return count;
    }

    // Method to split text into words using charAt() and space indexes
    public static String[] splitUsingCharAt(String text) {

        int length = findLength(text);

        // Count spaces
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Store space indexes
        int[] spaceIndexes = new int[spaceCount + 2];
        int index = 0;

        spaceIndexes[index++] = -1; // start boundary

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        spaceIndexes[index] = length; // end boundary

        // Extract words
        String[] words = new String[spaceIndexes.length - 1];

        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // User-defined split
        String[] customSplit = splitUsingCharAt(text);

        // Built-in split
        String[] builtInSplit = text.split(" ");

        // Compare both results
        boolean isSame = compareArrays(customSplit, builtInSplit);

        System.out.println("\nWords using charAt():");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using split():");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + isSame);

        sc.close();
    }
}
