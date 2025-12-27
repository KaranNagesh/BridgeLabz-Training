package com.constructorandinstance.level1;

public class Vehicle {
	String ownerName;
    String vehicleType;
    static int registrationFee;
    
    Vehicle(String ownerName,String vehicleType, int registrationFee){
    	 this.ownerName = ownerName;
    	 this.vehicleType = vehicleType;
    	 this.registrationFee = registrationFee;
    }
    
   public void displayVehicleDetails(){
    	System.out.println("Owner Name : " +ownerName );
    	System.out.println("Vehicle type : " +vehicleType );
    }
    
   public void updateRegistrationFee(){
    	System.out.println("Registration fee : " +registrationFee);
    }
    
    
	public static void main(String[] args) {
		Vehicle v = new Vehicle("Ansh","four wheeler",120000);
		v.displayVehicleDetails();
		v.updateRegistrationFee();
	}

}
