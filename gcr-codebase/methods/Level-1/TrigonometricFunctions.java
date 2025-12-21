import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent
    public double[] calculateTrigonometricFunctions(double angle) {

        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric values
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        // Return results as an array
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take angle input in degrees
        double angle = sc.nextDouble();

        // Create object to call non-static method
        TrigonometricFunctions tf = new TrigonometricFunctions();

        // Call method
        double[] result = tf.calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine value: " + result[0]);
        System.out.println("Cosine value: " + result[1]);
        System.out.println("Tangent value: " + result[2]);

        sc.close();
    }
}
