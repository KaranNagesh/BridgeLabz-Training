import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read weight in kilograms
        double weight = sc.nextDouble();

        // Read height in centimeters
        double height = sc.nextDouble();

        // Convert height from centimeters to meters
        double heightInMeter = height / 100;

        // Calculate BMI using formula: weight / (height^2)
        double bmi = weight / (heightInMeter * heightInMeter);

        // Check BMI category
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        }
        else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }

        // Close the scanner
        sc.close();
    }
}
