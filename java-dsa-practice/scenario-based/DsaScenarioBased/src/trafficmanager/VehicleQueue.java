package trafficmanager;


//Queue implementation for waiting vehicles
class VehicleQueue {
private String[] queue;
private int front, rear, size;

VehicleQueue(int capacity) {
   queue = new String[capacity];
   front = rear = -1;
   size = capacity;
}

// Enqueue vehicle
void enqueue(String vehicleNumber) {
   if (rear == size - 1) {
       System.out.println("Queue Overflow: Vehicle cannot enter now");
       return;
   }

   if (front == -1)
       front = 0;

   queue[++rear] = vehicleNumber;
   System.out.println("Vehicle added to queue: " + vehicleNumber);
}

// Dequeue vehicle
String dequeue() {
   if (front == -1 || front > rear) {
       System.out.println("Queue Underflow: No vehicles waiting");
       return null;
   }

   return queue[front++];
}

// Check if queue is empty
boolean isEmpty() {
   return front == -1 || front > rear;
}
}