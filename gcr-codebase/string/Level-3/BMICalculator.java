import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and Status for one person
    // Returns String array: {BMI, Status}
    public static String[] calculateBMIAndStatus(double weightKg, double heightCm) {

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // BMI formula
        double bmi = weightKg / (heightMeter * heightMeter);

        // Round BMI to 2 decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.valueOf(bmi), status};
    }

    // Method to generate final 2D String array with Height, Weight, BMI, Status
    public static String[][] generateBMIReport(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMIAndStatus(weight, height);

            result[i][0] = String.valueOf(height); // Height
            result[i][1] = String.valueOf(weight); // Weight
            result[i][2] = bmiResult[0];           // BMI
            result[i][3] = bmiResult[1];           // Status
        }

        return result;
    }

    // Method to display the BMI report in tabular format
    public static void displayBMIReport(String[][] report) {

        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < report.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                report[i][0] + "\t\t" +
                report[i][1] + "\t\t" +
                report[i][2] + "\t" +
                report[i][3]
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array: [10][2] -> weight, height
        double[][] inputData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            inputData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            inputData[i][1] = sc.nextDouble();
        }

        String[][] bmiReport = generateBMIReport(inputData);
        displayBMIReport(bmiReport);

        sc.close();
    }
}
