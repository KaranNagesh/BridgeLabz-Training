import java.util.Scanner;

public class BMICalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        //  Create arrays to store weight, height, BMI, and status
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        //  Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            height[i] = sc.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {

            // Convert height from cm to meters
            double heightInMeter = height[i] / 100;

            // Calculate BMI
            bmi[i] = weight[i] / (heightInMeter * heightInMeter);

            // Determine BMI status using given table
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            }
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            }
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            }
            else {
                status[i] = "Obese";
            }
        }

        //  Display height, weight, BMI, and status

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + height[i] + " cm");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
        }

        sc.close();
    }
}
