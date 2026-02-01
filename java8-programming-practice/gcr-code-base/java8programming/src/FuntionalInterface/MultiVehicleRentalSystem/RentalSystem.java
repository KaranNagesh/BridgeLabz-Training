package FuntionalInterface.MultiVehicleRentalSystem;

public class RentalSystem {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.rent();
        car.returnVehicle();

        bike.rent();
        bike.returnVehicle();

        bus.rent();
        bus.returnVehicle();
    }
}
