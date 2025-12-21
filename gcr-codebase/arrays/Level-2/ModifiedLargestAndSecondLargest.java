import java.util.Scanner;

public class ModifiedLargestAndSecondLargest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		int maxDigit = 10;
		int arr[] = new int[maxDigit];import java.util.Scanner;

public class ModifiedLargestAndSecondLargest {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take input number from user
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // Initial size of the array to store digits
        int maxDigit = 10;
        int arr[] = new int[maxDigit];

        // Index to track how many digits are stored
        int index = 0;

        // Extract digits and store dynamically in array
        while (num != 0) {

            // If array is full, increase its size
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                // Create a new larger array
                int temp[] = new int[maxDigit];

                // Copy old values to new array
                for (int i = 0; i < index; i++) {
                    temp[i] = arr[i];
                }

                // Assign new array to arr
                arr = temp;
            }

            // Store last digit of number
            arr[index] = num % 10;
            index++;

            // Remove last digit from number
            num = num / 10;
        }

        // Variables to store largest and second largest digit
        int largest = 0;
        int secondLargest = 0;

        // Loop through stored digits to find largest and second largest
        for (int i = 0; i < index; i++) {

            // If current digit is greater than largest
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            // If current digit is between largest and second largest
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

		int index = 0;
		
		while(num != 0){
			if(index == maxDigit){
			maxDigit = maxDigit + 10;
			
			 int temp[] = new int[maxDigit];
			 for(int i=0; i<index; i++){
				temp[i] = arr[i];
			 }
		   arr = temp;
			
		}
			arr[index] = num%10;
			index++;
			num = num / 10;
		}
		
		int largest = 0;
		int secondLargest = 0;
		
		for(int i = 0 ; i < index; i++){
			if(arr[i] > largest){
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] >secondLargest && arr[i] < largest){
				secondLargest = arr[i];
			}
			
		}
		
		System.out.println("The largest digit is " + largest);
		System.out.println("The Second largest digit is " + secondLargest);
		
	}
}