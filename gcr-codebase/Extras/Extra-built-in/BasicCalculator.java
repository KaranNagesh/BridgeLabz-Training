import java.util.Scanner;

public class BasicCalculator {

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        System.out.print("Choose operation (+ - * /): ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+': System.out.println("Result: " + add(firstNumber, secondNumber)); break;
            case '-': System.out.println("Result: " + subtract(firstNumber, secondNumber)); break;
            case '*': System.out.println("Result: " + multiply(firstNumber, secondNumber)); break;
            case '/': System.out.println("Result: " + divide(firstNumber, secondNumber)); break;
            default: System.out.println("Invalid operation.");
        }

        scanner.close();
    }
}
