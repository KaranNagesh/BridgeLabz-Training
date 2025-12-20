import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read input number
        int num = sc.nextInt();

        // Check for invalid input
        if (num < 1) {
            System.out.println("error");
        } else {

            // Arrays to store odd and even numbers
            int odd[] = new int[(num / 2) + 1];
            int even[] = new int[(num / 2) + 1];

            // Index counters for odd and even arrays
            int oddIndex = 0;
            int evenIndex = 0;

            // Loop from 1 to num
            for (int i = 1; i <= num; i++) {

                // Check even number
                if (i % 2 == 0) {
                    even[evenIndex] = i;
                    evenIndex++;
                }
                // Otherwise odd number
                else {
                    odd[oddIndex] = i;
                    oddIndex++;
                }
            }

            // Print odd numbers
            System.out.println("Odd numbers:");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(odd[i] + " ");
            }

            System.out.println();

            // Print even numbers
            System.out.println("Even numbers:");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(even[i] + " ");
            }
        }

        // Close scanner
        sc.close();
    }
}
