import java.util.Scanner;

public class StudentGradeCalculator {

    // Method to generate random 2-digit PCM scores
    // Columns: 0 -> Physics, 1 -> Chemistry, 2 -> Maths
    public static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }
        return scores;
    }

    // Method to calculate Total, Average, Percentage
    // Columns: 0 -> Total, 1 -> Average, 2 -> Percentage
    public static double[][] calculateResults(int[][] marks) {

        double[][] results = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to calculate Grade with Remarks
    public static String calculateGradeAndRemarks(double percentage) {

        if (percentage >= 80) {
            return "A (Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            return "B (Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            return "C (Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            return "D (Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            return "E (Level 1-, too below agency-normalized standards)";
        } else {
            return "R (Remedial standards)";
        }
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] marks, double[][] results) {

        System.out.println(
            "Stu\tPhy\tChem\tMath\tTotal\tAverage\tPercentage\tGrade & Remarks"
        );

        for (int i = 0; i < marks.length; i++) {

            String grade = calculateGradeAndRemarks(results[i][2]);

            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                (int) results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "%\t\t" +
                grade
            );
        }
    }

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] pcmMarks = generatePCMScores(students);
        double[][] results = calculateResults(pcmMarks);

        displayScorecard(pcmMarks, results);

        sc.close();
    }
}
