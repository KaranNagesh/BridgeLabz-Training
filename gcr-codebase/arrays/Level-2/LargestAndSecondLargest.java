import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read the number from user
        int num = sc.nextInt();

        // Array to store digits of the number
        int arr[] = new int[10];

        // Index to track number of digits stored
        int index = 0;

        // Extract digits of the number and store in array
        while (num != 0) {
            arr[index] = num % 10;   // Get last digit
            index++;
            num = num / 10;          // Remove last digit
        }

        // Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Loop through the array to find largest and second largest
        for (int i = 0; i < arr.length; i++) {

            // If current element is greater than largest
            if (arr[i] > largest) {
                secondLargest = largest;  // Update second largest
                largest = arr[i];         // Update largest
            }
            // If current element is between largest and second largest
            else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        // Print results
        System.out.println("The largest digit is " + largest);
        System.out.println("The Second largest digit is " + secondLargest);

        // Close scanner
        sc.close();
    }
}
