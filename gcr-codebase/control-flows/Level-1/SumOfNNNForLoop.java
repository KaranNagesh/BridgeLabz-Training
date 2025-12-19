import java.util.Scanner;

public class SumOfNNNForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        int number = sc.nextInt();

        // Check for Natural Number
        if (number > 0) {

            // Compute using formula
            int formulaSum = number * (number + 1) / 2;

            // Compute using for loop
            int loopSum = 0;
            for (int i = 1; i <= number; i++) {
                loopSum += i;
            }

            // Compare results
            if (formulaSum == loopSum) {
                System.out.println("Sum with formula and loop both are same");
            } else {
                System.out.println("Sum with formula and loop both are not same");
            }

        } else {
            System.out.println("Please enter a Natural Number");
        }

    
    }
}
