import java.util.Scanner;

public class StudentGrading2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array to store marks: Physics, Chemistry, Maths
        int[][] marks = new int[n][3];

        // Arrays to store percentage and grade
        int[] percentage = new int[n];
        String[] grade = new String[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            int p = sc.nextInt();

            System.out.print("Chemistry: ");
            int c = sc.nextInt();

            System.out.print("Maths: ");
            int m = sc.nextInt();

            // Validate marks
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks! Enter positive values.");
                i--;
                continue;
            }

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "D-";
            } else {
                grade[i] = "R";
            }
        }

        // Display results
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }
}
