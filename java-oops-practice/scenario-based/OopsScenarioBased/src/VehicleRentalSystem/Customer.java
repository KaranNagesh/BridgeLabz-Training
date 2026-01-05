package VehicleRentalSystem;
//Main class that display the details of different vehicle
public class Customer {
	public static void main(String[] args) {
		
		//Creating object of different vehicle class
		Vehicle vehicle1 = new Car(200,"Petrol",6);
		Vehicle vehicle2 = new Truck(100,"Diesel",12);
		Vehicle vehicle3 = new MotorCycle(120,"Petrol","Yes");
		
		//Displaying info of different vehicle
		System.out.println("---------------------");
		vehicle1.displayInfo();
		System.out.println("---------------------");
		vehicle2.displayInfo();
		System.out.println("---------------------");
		vehicle3.displayInfo();
		System.out.println("---------------------");
		
		//computing rent of vehicle
		System.out.println("Renting Bike for 5 days total charges -> " + vehicle3.calculateRent(5,100));
		System.out.println("Renting Car for 2 days total charges -> " + vehicle1.calculateRent(2,200));
		System.out.println("Renting Truck for 10 days total charges -> " + vehicle2.calculateRent(10,1000));
	}
}
