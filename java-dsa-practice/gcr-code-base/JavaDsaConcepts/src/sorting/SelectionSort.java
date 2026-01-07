package sorting;

public class SelectionSort {

    // Method to perform selection sort
    public static void selectionSort(int[] scores) {

        int n = scores.length;

        // Traverse through all elements
        for (int i = 0; i < n - 1; i++) {

            // Assume current index has the minimum value
            int minIndex = i;

            // Find the minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int score : arr) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] examScores = {78, 92, 65, 88, 70};

        System.out.println("Exam scores before sorting:");
        printArray(examScores);

        selectionSort(examScores);

        System.out.println("Exam scores after sorting (Ascending Order):");
        printArray(examScores);
    }
}