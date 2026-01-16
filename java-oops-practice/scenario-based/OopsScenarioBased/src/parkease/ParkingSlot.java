
package parkease;

//Parking slot class
class ParkingSlot {

 private int slotId;
 private boolean isOccupied; // slot availability (encapsulated)
 private String vehicleTypeAllowed;
 private String location;

 // Internal booking record (private)
 private String bookingLog;

 // Constructor to initialize slot
 public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
     this.slotId = slotId;
     this.location = location;
     this.vehicleTypeAllowed = vehicleTypeAllowed;
     this.isOccupied = false;
     this.bookingLog = "No bookings yet.";
 }

 // Assign vehicle to slot (controlled access)
 public boolean assignSlot(Vehicle vehicle) {

     if (isOccupied) {
         System.out.println("Slot " + slotId + " is already occupied.");
         return false;
     }

     // Check vehicle compatibility
     if (!vehicle.getClass().getSimpleName().equalsIgnoreCase(vehicleTypeAllowed)) {
         System.out.println("Vehicle type not allowed in this slot.");
         return false;
     }

     isOccupied = true;
     bookingLog = "Slot booked by vehicle: " + vehicle.vehicleNumber;
     System.out.println("Slot " + slotId + " assigned successfully.");
     return true;
 }

 // Release slot
 public void releaseSlot() {
     isOccupied = false;
     bookingLog = "Slot released and available.";
     System.out.println("Slot " + slotId + " is now free.");
 }

 // Check slot availability
 public boolean isAvailable() {
     return !isOccupied;
 }

 // Expose booking logs safely
 public void showBookingLog() {
     System.out.println("Slot " + slotId + " Log: " + bookingLog);
 }
}
