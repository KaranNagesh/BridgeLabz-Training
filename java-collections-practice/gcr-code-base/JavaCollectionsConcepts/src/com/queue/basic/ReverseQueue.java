package com.queue.basic;


import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

	// Method to reverse the queue using recursion
	static void reverseQueue(Queue<Integer> queue) {

		// Base case: if queue is empty, return
		if (queue.isEmpty()) {
			return;
		}

		// Remove front element
		int front = queue.remove();

		// Recursively reverse remaining queue
		reverseQueue(queue);

		// Add the removed element at the rear
		queue.add(front);
	}

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);

		System.out.println("Original Queue: " + queue);

		reverseQueue(queue);

		System.out.println("Reversed Queue: " + queue);
	}
}