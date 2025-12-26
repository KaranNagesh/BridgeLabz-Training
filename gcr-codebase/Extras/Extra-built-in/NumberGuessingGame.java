import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate computer guess within a range
    public static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lowerBound = 1;
        int upperBound = 100;
        String userFeedback;

        System.out.println("Think of a number between 1 and 100.");

        // Game via infinite loop
        while (true) {
            int computerGuess = generateGuess(lowerBound, upperBound);
            System.out.println("Computer guesses: " + computerGuess);
            System.out.print("Enter feedback (high / low / correct): ");
            userFeedback = scanner.nextLine();

            if (userFeedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed correctly!");
                break;
            } else if (userFeedback.equalsIgnoreCase("high")) {
                upperBound = computerGuess - 1;
            } else if (userFeedback.equalsIgnoreCase("low")) {
                lowerBound = computerGuess + 1;
            }
        }

        scanner.close();
    }
}
