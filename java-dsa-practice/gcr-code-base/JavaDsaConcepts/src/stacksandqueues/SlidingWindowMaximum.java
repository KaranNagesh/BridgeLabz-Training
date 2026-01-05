package stacksandqueues;


import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    public static void findMaxInWindows(int[] arr, int k) {

        if (arr == null || k <= 0) return;

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove indices that are out of this window
            if (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.poll();
            }

            // Remove elements smaller than current element
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offer(i);

            // Print max for current window
            if (i >= k - 1) {
                System.out.print(arr[deque.peek()] + " ");
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.print("Sliding Window Maximum: ");
        findMaxInWindows(arr, k);
    }
}