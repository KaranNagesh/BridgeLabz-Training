import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read marks of subjects
        int marksOfPhysics = sc.nextInt();
        int marksOfChemistry = sc.nextInt();
        int marksOfMaths = sc.nextInt();

        // Calculate average percentage
        int percentage = (marksOfPhysics + marksOfChemistry + marksOfMaths) / 3;

        // Check grading levels
        if (percentage >= 80) {
            System.out.println("The average marks is " + percentage +
                    "% Level 4, above agency-normalized standards");
        }
        else if (percentage >= 70) {
            System.out.println("The average marks is " + percentage +
                    "% Level 3, at agency-normalized standards");
        }
        else if (percentage >= 60) {
            System.out.println("The average marks is " + percentage +
                    "% Level 2, below but approaching agency-normalized standards");
        }
        else if (percentage >= 50) {
            System.out.println("The average marks is " + percentage +
                    "% Level 1, well below agency-normalized standards");
        }
        else if (percentage >= 40) {
            System.out.println("The average marks is " + percentage +
                    "% Level 1-, too below agency-normalized standards");
        }
        else {
            System.out.println("The average marks is " + percentage +
                    "% Remedial standards");
        }

       
    }
}
