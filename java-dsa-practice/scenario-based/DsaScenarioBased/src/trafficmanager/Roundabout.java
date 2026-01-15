package trafficmanager;


//Circular Linked List for Roundabout
class Roundabout {
private Vehicle head = null;

// Add vehicle to roundabout
void addVehicle(String vehicleNumber) {
   Vehicle newVehicle = new Vehicle(vehicleNumber);

   // If roundabout is empty
   if (head == null) {
       head = newVehicle;
       newVehicle.next = head;
       return;
   }

   // Insert at end of circular list
   Vehicle temp = head;
   while (temp.next != head) {
       temp = temp.next;
   }
   temp.next = newVehicle;
   newVehicle.next = head;
}

// Remove vehicle from roundabout
void removeVehicle(String vehicleNumber) {
   if (head == null) {
       System.out.println("Roundabout is empty");
       return;
   }

   Vehicle curr = head;
   Vehicle prev = null;

   do {
       if (curr.vehicleNumber.equals(vehicleNumber)) {

           // Only one vehicle
           if (curr == head && curr.next == head) {
               head = null;
           }
           // Removing head
           else if (curr == head) {
               Vehicle temp = head;
               while (temp.next != head) {
                   temp = temp.next;
               }
               head = head.next;
               temp.next = head;
           }
           // Removing middle or last
           else {
               prev.next = curr.next;
           }

           System.out.println("Vehicle removed: " + vehicleNumber);
           return;
       }

       prev = curr;
       curr = curr.next;

   } while (curr != head);

   System.out.println("Vehicle not found in roundabout");
}

// Display roundabout state
void display() {
   if (head == null) {
       System.out.println("Roundabout is empty");
       return;
   }

   Vehicle temp = head;
   System.out.print("Roundabout: ");
   do {
       System.out.print(temp.vehicleNumber + " -> ");
       temp = temp.next;
   } while (temp != head);
   System.out.println("(back to " + head.vehicleNumber + ")");
}

// Check if roundabout is empty
boolean isEmpty() {
   return head == null;
}
}