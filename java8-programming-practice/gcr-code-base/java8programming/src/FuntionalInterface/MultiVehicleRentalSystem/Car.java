package FuntionalInterface.MultiVehicleRentalSystem;

class Car implements Vehicle {

    @Override
    public void rent() {
        System.out.println("Car rented at ₹2000 per day");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car returned successfully");
    }
}
