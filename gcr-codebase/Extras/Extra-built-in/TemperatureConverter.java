import java.util.Scanner;

public class TemperatureConverter {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = scanner.next().charAt(0);

        if (choice == 'C')
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
        else
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));

        scanner.close();
    }
}
