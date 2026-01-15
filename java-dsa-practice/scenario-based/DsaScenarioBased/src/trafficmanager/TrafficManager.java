package trafficmanager;


//Main Traffic Manager class
public class TrafficManager {

public static void main(String[] args) {

   Roundabout roundabout = new Roundabout();
   VehicleQueue waitingQueue = new VehicleQueue(3);

   // Vehicles arrive
   waitingQueue.enqueue("CAR-101");
   waitingQueue.enqueue("CAR-102");
   waitingQueue.enqueue("CAR-103");
   waitingQueue.enqueue("CAR-104"); // Overflow

   // Move vehicles from queue to roundabout
   while (!waitingQueue.isEmpty()) {
       roundabout.addVehicle(waitingQueue.dequeue());
   }

   // Display roundabout
   roundabout.display();

   // Remove vehicle
   roundabout.removeVehicle("CAR-102");
   roundabout.display();

   // Add new vehicle directly
   roundabout.addVehicle("CAR-105");
   roundabout.display();
}
}