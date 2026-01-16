
package parkease;

//Car vehicle type
class Car extends Vehicle {

 public Car(String vehicleNumber) {
     super(vehicleNumber, 50); // ₹50 per hour
 }

 // Car-specific charge calculation
 @Override
 public double calculateCharges(int hours) {
     double penalty = (hours > 5) ? 100 : 0; // penalty if overtime
     return (baseRate * hours) + penalty;
 }
}
