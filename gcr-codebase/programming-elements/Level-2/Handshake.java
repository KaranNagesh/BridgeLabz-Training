import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input: number of students
        int numberOfStudents = sc.nextInt();

        // Check for valid number of students
        if (numberOfStudents > 1) {

            // Apply handshake formula: n * (n - 1) / 2
            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Display result
            System.out.println("Maximum number of handshakes: " + handshakes);

        } else {
            System.out.println("At least 2 students are required for handshakes.");
        }

        
    }
}
