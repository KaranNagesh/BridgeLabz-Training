import java.util.Scanner;

public class StudentVoteChecker {

    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            // Generate random age between 10 and 99
            ages[i] = (int) (Math.random() * 90) + 10;
        }
        return ages;
    }

    // Method to check voting eligibility
    // Returns 2D String array: Age | Can Vote (true/false)
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]); // store age

            if (ages[i] < 0) {
                result[i][1] = "false"; // invalid age
            } else if (ages[i] >= 18) {
                result[i][1] = "true";  // can vote
            } else {
                result[i][1] = "false"; // cannot vote
            }
        }
        return result;
    }

    // Method to display result in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\nStudent\tAge\tCan Vote");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                data[i][0] + "\t" +
                data[i][1]
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateRandomAges(n);
        String[][] eligibility = checkVotingEligibility(ages);

        displayResult(eligibility);

        sc.close();
    }
}
