import java.util.Scanner;

public class BMIMultiDimensional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        //  Create 2D array to store weight, height and BMI
        // personData[i][0] -> weight
        // personData[i][1] -> height
        // personData[i][2] -> BMI
        double[][] personData = new double[number][3];

        // Array to store weight status of persons
        String[] weightStatus = new String[number];

        //  Take input for weight and height with validation
        for (int i = 0; i < number; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            // Input weight
            System.out.print("Enter weight (kg): ");
            double weight = sc.nextDouble();

            if (weight <= 0) {
                System.out.println("Invalid weight! Please enter positive value.");
                i--;   // repeat input for same person
                continue;
            }

            // Input height
            System.out.print("Enter height (cm): ");
            double height = sc.nextDouble();

            if (height <= 0) {
                System.out.println("Invalid height! Please enter positive value.");
                i--;   // repeat input for same person
                continue;
            }

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;
        }

        //  Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {

            double heightInMeter = personData[i][1] / 100;

            // Calculate BMI
            personData[i][2] = personData[i][0] /
                               (heightInMeter * heightInMeter);

            // Determine weight status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } 
            else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } 
            else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } 
            else {
                weightStatus[i] = "Obese";
            }
        }

        //  Display height, weight, BMI and status
	    for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight : " + personData[i][0] + " kg");
            System.out.println("Height : " + personData[i][1] + " cm");
            System.out.println("BMI    : " + personData[i][2]);
            System.out.println("Status : " + weightStatus[i]);
        }

        sc.close();
    }
}
