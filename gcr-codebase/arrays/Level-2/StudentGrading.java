import java.util.Scanner;

public class StudentGrading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. Create arrays
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        int[] percentage = new int[n];
        String[] grade = new String[n];

        //  Take input for marks with validation
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            int p = sc.nextInt();

            System.out.print("Chemistry: ");
            int c = sc.nextInt();

            System.out.print("Maths: ");
            int m = sc.nextInt();

            // Validation for negative marks
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks! Please enter positive values.");
                i--; // repeat this student
                continue;
            }

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
        }

        //  Calculate percentage and grade
        for (int i = 0; i < n; i++) {

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

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

        //  Display student details
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }
}
