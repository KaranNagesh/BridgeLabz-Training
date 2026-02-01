package FuntionalInterface.smartvehicledashboard;

interface Vehicle {

    void displaySpeed();

   
    default void displayBatteryStatus() {
        System.out.println("Battery status not applicable");
    }
}
