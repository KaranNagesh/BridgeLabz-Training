import java.util.Scanner;

public class NormalFizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number > 0) {

            int i = 1;

            // FizzBuzz logic using for loop
            for(int j=0; j<number; j++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }

                i++;
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

    }
}
