import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and store it in 2D array
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];        // weight in kg
            double heightCm = data[i][1];      // height in cm
            double heightMeter = heightCm / 100;

            // BMI formula
            data[i][2] = weight / (heightMeter * heightMeter);
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array: [weight, height, BMI]
        double[][] persons = new double[10][3];

        // Input weight and height
        for (int i = 0; i < persons.length; i++) {

            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(persons);

        // Get BMI status
        String[] status = determineBMIStatus(persons);

        // Display result
        System.out.println("\n===== BMI REPORT =====");
        for (int i = 0; i < persons.length; i++) {

            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + persons[i][0] + " kg");
            System.out.println("Height: " + persons[i][1] + " cm");
            System.out.printf("BMI: %.2f\n", persons[i][2]);
            System.out.println("Status: " + status[i]);
            System.out.println("----------------------");
        }

        sc.close();
    }
}
