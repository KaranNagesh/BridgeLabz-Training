package sorting;


public class BubbleSort {

    public static void bubbleSort(int[] marks) {
        int n = marks.length;

        // Traverse the array multiple times
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if elements are in wrong order
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Utility method to print the array
    public static void printMarks(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] studentMarks = {78, 45, 90, 62, 88, 55};

        System.out.println("Marks before sorting:");
        printMarks(studentMarks);

        bubbleSort(studentMarks);

        System.out.println("Marks after sorting (Ascending Order):");
        printMarks(studentMarks);
    }
}