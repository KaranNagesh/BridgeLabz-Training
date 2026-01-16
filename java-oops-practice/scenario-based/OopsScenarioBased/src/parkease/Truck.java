
package parkease;

//Truck vehicle type
class Truck extends Vehicle {

 public Truck(String vehicleNumber) {
     super(vehicleNumber, 100); // ₹100 per hour
 }

 // Truck-specific charge calculation
 @Override
 public double calculateCharges(int hours) {
     double penalty = (hours > 3) ? 200 : 0;
     return (baseRate * hours) + penalty;
 }
}
