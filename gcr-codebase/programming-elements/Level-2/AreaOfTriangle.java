import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and height in centimeters
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert square centimeters to square inches
        // 1 inch = 2.54 cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is " 
                            + areaSqIn + " and sq cm is " + areaSqCm);

       
    }
}
