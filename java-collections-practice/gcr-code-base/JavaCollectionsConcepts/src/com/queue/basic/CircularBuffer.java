package com.queue.basic;


class CircularBuffer {

	private int[] buffer; // Array to store elements
	private int size; // Buffer size
	private int front; // Points to oldest element
	private int rear; // Points to next insertion
	private int count; // Number of elements

	// Constructor
	public CircularBuffer(int size) {
		this.size = size;
		buffer = new int[size];
		front = 0;
		rear = 0;
		count = 0;
	}

	// Insert element into circular buffer
	public void insert(int value) {

		// If buffer is full, overwrite oldest element
		if (count == size) {
			front = (front + 1) % size; // Move front forward
		} else {
			count++;
		}

		buffer[rear] = value;
		rear = (rear + 1) % size;
	}

	// Display buffer contents in correct order
	public void display() {
		System.out.print("Buffer: [");

		for (int i = 0; i < count; i++) {
			System.out.print(buffer[(front + i) % size]);
			if (i < count - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {

		CircularBuffer cb = new CircularBuffer(3);

		cb.insert(1);
		cb.insert(2);
		cb.insert(3);
		cb.display(); // [1, 2, 3]

		cb.insert(4);
		cb.display(); // [2, 3, 4]
	}
}