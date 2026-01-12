package algorithmanalysis;

import java.util.*;

public class DataStructure {

    // Linear search in array - O(N)
    public static boolean arraySearch(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 100_000, 1_000_000};
        int target = -1; // Worst-case (not present)

        for (int size : sizes) {

            System.out.println("\nDataset Size: " + size);

            //Array
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            long start = System.nanoTime();
            arraySearch(array, target);
            long end = System.nanoTime();
            System.out.println("Array Search Time: " + (end - start) + " ns");

            // Hash Set
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            start = System.nanoTime();
            hashSet.contains(target);
            end = System.nanoTime();
            System.out.println("HashSet Search Time: " + (end - start) + " ns");

            // Tree Set
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < size; i++) {
                treeSet.add(i);
            }

            start = System.nanoTime();
            treeSet.contains(target);
            end = System.nanoTime();
            System.out.println("TreeSet Search Time: " + (end - start) + " ns");

            System.out.println("------------------------------------");
        }
    }
}