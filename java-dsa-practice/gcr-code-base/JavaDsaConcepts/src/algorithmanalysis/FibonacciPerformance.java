package algorithmanalysis;


public class FibonacciPerformance {

    // Recursive Fibonacci
    // Time Complexity: O(2^n)
    // Space Complexity: O(n) (due to recursion stack)
    
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

     // Iterative Fibonacci
     // Time Complexity: O(n)
     // Space Complexity: O(1)
    
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    //Main method
    public static void main(String[] args) {

        int[] testValues = {10, 30, 40};
        // Recursive for 50 is intentionally skipped (too slow)

        for (int n : testValues) {

            System.out.println("\nFibonacci Number: " + n);

            // Recursive Timing 
            long startRecursive = System.nanoTime();
            int recResult = fibonacciRecursive(n);
            long endRecursive = System.nanoTime();

            long recursiveTime = endRecursive - startRecursive;
            System.out.println("Recursive Result: " + recResult);
            System.out.println("Recursive Time: " + recursiveTime + " ns");

            // Iterative Timing
            long startIterative = System.nanoTime();
            int iterResult = fibonacciIterative(n);
            long endIterative = System.nanoTime();

            long iterativeTime = endIterative - startIterative;
            System.out.println("Iterative Result: " + iterResult);
            System.out.println("Iterative Time: " + iterativeTime + " ns");

            System.out.println("------------------------------------");
        }

        //Iterative Fibonacci for Large N
        int largeN = 50;
        long start = System.nanoTime();
        int result = fibonacciIterative(largeN);
        long end = System.nanoTime();

        System.out.println("\nFibonacci(" + largeN + ") using Iterative:");
        System.out.println("Result: " + result);
        System.out.println("Time: " + (end - start) + " ns");
    }
}