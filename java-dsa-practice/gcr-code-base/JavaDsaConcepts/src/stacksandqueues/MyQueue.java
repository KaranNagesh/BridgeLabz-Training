package stacksandqueues;
import java.util.*;


public class MyQueue {
	
	Stack<Integer> stc1 = new Stack<>();
	Stack<Integer> stc2 = new Stack<>();
	
    // Enqueue operation (costly)
    void enqueue(int x) {
        
        // Move all elements from s1 to s2
        while (!stc1.isEmpty()) {
            stc2.push(stc1.pop());
        }

        // Push the new item into s1
        stc1.push(x);

        // Push everything back to s1
        while (!stc2.isEmpty()) {
            stc1.push(stc2.pop());
        }
    }
    
    // Dequeue operation
    void dequeue() {
        if (stc1.isEmpty()) {
            
            // Queue underflow
            return; 
        }
        stc1.pop();
    }

    // Front operation
    int front() {
        if (stc1.isEmpty()) {
            
            // Queue empty
            return -1; 
        }
        return stc1.peek();
    }
    // Size operation
    int size() {
        return stc1.size();
    }

    
    
    
	public static void main(String args[]) {
		MyQueue myqueue = new MyQueue();
		
		myqueue.enqueue(1);
		myqueue.enqueue(2);
		myqueue.enqueue(3);
		myqueue.enqueue(4);
		
		System.out.println(myqueue.front());
		
		myqueue.enqueue(5);
		
		myqueue.dequeue();
		
		System.out.println(myqueue.front());
		System.out.println(myqueue.size());
		
	}
}