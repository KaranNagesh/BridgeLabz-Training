
package parkease;

//Bike vehicle type
class Bike extends Vehicle {

 public Bike(String vehicleNumber) {
     super(vehicleNumber, 20); // ₹20 per hour
 }

 // Bike-specific charge calculation
 @Override
 public double calculateCharges(int hours) {
     double penalty = (hours > 4) ? 50 : 0;
     return (baseRate * hours) + penalty;
 }
}
