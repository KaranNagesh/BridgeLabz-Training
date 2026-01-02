package com.inheritance.hybrid.vehiclemanagement;

public class Main {
    public static void main(String[] args) {
    	
    	//Creating onject of ev and pv class
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);
        
        //displaying details
        ev.charge();
        pv.refuel();
    }
}
