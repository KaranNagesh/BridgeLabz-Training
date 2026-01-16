
package parkease;

//Base Vehicle class
abstract class Vehicle implements IPayable {

 protected String vehicleNumber;
 protected double baseRate; // base parking rate per hour

 // Constructor
 public Vehicle(String vehicleNumber, double baseRate) {
     this.vehicleNumber = vehicleNumber;
     this.baseRate = baseRate;
 }
}
