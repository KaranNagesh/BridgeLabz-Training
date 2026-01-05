package stacksandqueues;


import java.util.Stack;

public class StockSpanProblem {

    // Function to calculate stock span
    public static void calculateSpan(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        // First day span is always 1
        stack.push(0);
        System.out.print("1 ");

        // Process remaining days
        for (int i = 1; i < prices.length; i++) {

            // Pop prices from stack that are <= current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack empty, span = i + 1
            int span = stack.isEmpty() ? i + 1 : i - stack.peek();

            System.out.print(span + " ");

            // Push current index
            stack.push(i);
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        System.out.print("Stock Span: ");
        calculateSpan(prices);
    }
}