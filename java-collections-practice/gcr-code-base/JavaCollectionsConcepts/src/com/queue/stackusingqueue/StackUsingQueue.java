package com.queue.stackusingqueue;


import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {

	Queue<Integer> q1 = new LinkedList<>(); // Main queue
	Queue<Integer> q2 = new LinkedList<>(); // Auxiliary queue

	// Push operation
	public void push(int x) {

		// Step 1: Add new element to q2
		q2.add(x);

		// Step 2: Move all elements from q1 to q2
		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}

		// Step 3: Swap q1 and q2
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	// Pop operation
	public int pop() {

		if (q1.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return q1.remove();
	}

	// Top operation
	public int top() {

		if (q1.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return q1.peek();
	}

	// Check if stack is empty
	public boolean isEmpty() {
		return q1.isEmpty();
	}
}