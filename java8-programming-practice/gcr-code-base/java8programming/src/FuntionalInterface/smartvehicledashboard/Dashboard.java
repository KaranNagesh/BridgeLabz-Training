package FuntionalInterface.smartvehicledashboard;

public class Dashboard {

    public static void main(String[] args) {

        Vehicle car1 = new PetrolCar();
        Vehicle car2 = new ElectricCar();

        car1.displaySpeed();
        car1.displayBatteryStatus();

        car2.displaySpeed();
        car2.displayBatteryStatus();
    }
}
