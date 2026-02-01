package FuntionalInterface.MultiVehicleRentalSystem;

class Bus implements Vehicle {

    @Override
    public void rent(){
        System.out.println("Bus rented at ₹8000 per day");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus returned successfully");
    }
}
