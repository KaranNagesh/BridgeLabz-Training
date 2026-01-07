package sorting;


import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] ages, int minAge, int maxAge) {

        int n = ages.length;

        //  Create count array
        int range = maxAge - minAge + 1;
        int[] count = new int[range];

        //  Count frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        //  Compute cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        //  Place elements in sorted order (stable)
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) { // traverse backwards for stability
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        //  Copy output back to original array
        System.arraycopy(output, 0, ages, 0, n);
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] studentAges = {12, 14, 10, 18, 16, 14, 12, 11, 17};

        System.out.println("Student ages before sorting:");
        printArray(studentAges);

        countingSort(studentAges, 10, 18);

        System.out.println("Student ages after sorting (Ascending Order):");
        printArray(studentAges);
    }
}