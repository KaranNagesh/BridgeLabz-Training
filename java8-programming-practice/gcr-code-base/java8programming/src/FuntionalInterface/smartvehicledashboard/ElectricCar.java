package FuntionalInterface.smartvehicledashboard;

class ElectricCar implements Vehicle {

    public void displaySpeed() {
        System.out.println("Speed: 90 km/h");
    }

    @Override
    public void displayBatteryStatus() {
        System.out.println("Battery: 75%");
    }
}
