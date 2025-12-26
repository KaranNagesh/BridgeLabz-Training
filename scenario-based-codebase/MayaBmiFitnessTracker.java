import java.util.Scanner;

public class MayaBmiFitnessTracker {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your weight in kilograms:");
		double weight = sc.nextDouble();

		System.out.println("Enter your height in meters:");
		double height = sc.nextDouble();

		// BMI calculation
		double bmi = weight / (height * height);

		System.out.println("Your BMI is: " + bmi);

		// BMI category using if-else
		if (bmi < 18.5) {
			System.out.println("BMI Category: Underweight");
		}
		else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("BMI Category: Normal");
		}
		else {
			System.out.println("BMI Category: Overweight");
		}

		sc.close();
	}
}
