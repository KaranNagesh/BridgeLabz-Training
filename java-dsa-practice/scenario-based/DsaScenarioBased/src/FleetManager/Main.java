package FleetManager;
import java.util.*;

public class Main {
	
	public static void merge(ArrayList<Vehicle> scheduler, ArrayList<Vehicle> vehicle) {
		int i = 0 ;
		int j = 0;
		int k = 0 ;
		ArrayList<Vehicle> temp = new ArrayList<>();
		
		if(scheduler.size() <= 0) {
			for(int l = 0 ; l < vehicle.size(); l++) {
				scheduler.add(vehicle.get(l));
			}
		}else {
		
		while(i< scheduler.size() && j < vehicle.size()) {
			if(scheduler.get(i).milage < vehicle.get(j).milage) {
				temp.add(scheduler.get(i));
				i++;
			} else {
				temp.add(vehicle.get(j));
				j++;
			}
			k++;
		}
		
		scheduler.clear();
		scheduler.addAll(temp);
		}
	}
	
	public static void show(ArrayList<Vehicle> vehicle) {
		for(int i = 0 ; i < vehicle.size(); i++) {
			System.out.println("Depot: " + vehicle.get(i).depotName + " \t\t\t  Bike : " + vehicle.get(i).vehicleName + " \t\t\t\t Mileage : " + vehicle.get(i).milage);
		}
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<Vehicle> scheduler = new ArrayList<>();
		
		Depot depo1 = new Depot("Bajaj" , 1);
		Depot depo2 = new Depot("Tvs" , 2);
		Depot depo3 = new Depot("Honda" , 3);
		Depot depo4 = new Depot("Yamaha" , 4);
	
		
		//adding vechile in depo1
		depo1.vehicle.add(new Vehicle("platina" ,"MP09ZE",40,"Bajaj"));
		depo1.vehicle.add(new Vehicle("CT100   ","MP09AA", 45, "Bajaj"));
		depo1.vehicle.add(new Vehicle("Discover","MP09AB", 50, "Bajaj"));
		depo1.vehicle.add(new Vehicle("Pulsar 125","MP09AC", 55, "Bajaj"));
		depo1.vehicle.add(new Vehicle("Platina ES","MP09AD", 60, "Bajaj"));
		System.out.println();
		System.out.println();
		System.out.println("----------List after first depo added---------");
		System.out.println();
		System.out.println();
		

		merge(scheduler,depo1.vehicle);
		show(scheduler);
		
		
		//adding vehicle in depot2
		depo2.vehicle.add(new Vehicle("Sport    ","MP10AA", 45, "TVS"));
		depo2.vehicle.add(new Vehicle("Star City","MP10AB", 50, "TVS"));
		depo2.vehicle.add(new Vehicle("Radeon   ","MP10AC", 55, "TVS"));
		depo2.vehicle.add(new Vehicle("Raider 125","MP10AD", 60, "TVS"));
		depo2.vehicle.add(new Vehicle("Apache RTR 160","MP10AE", 65, "TVS"));

		System.out.println();
		System.out.println();
		System.out.println("----------List after second added---------");
		System.out.println();
		System.out.println();

		merge(scheduler,depo2.vehicle);
		show(scheduler);
		
		
		//adding vehicle in depo3
		depo3.vehicle.add(new Vehicle("CD 110    ","MP11AA",45, "Honda"));
		depo3.vehicle.add(new Vehicle("Livo      ", "MP11AB", 50, "Honda"));
		depo3.vehicle.add(new Vehicle("SP 125    ","MP11AC", 55, "Honda"));
		depo3.vehicle.add(new Vehicle("Shine     ","MP11AD", 60, "Honda"));
		depo3.vehicle.add(new Vehicle("Unicorn    ","MP11AE", 65, "Honda"));

		
		System.out.println();
		System.out.println();
		System.out.println("----------List after third depo added---------");
		System.out.println();
		System.out.println();
		merge(scheduler,depo3.vehicle);
		show(scheduler);
		
		//adding vehicle in depo4
		depo4.vehicle.add(new Vehicle("Saluto     ", "MP12AA",45, "Yamaha"));
		depo4.vehicle.add(new Vehicle("Fascino    ", "MP12AB",50, "Yamaha"));
		depo4.vehicle.add(new Vehicle("Ray ZR     ", "MP12AC", 55, "Yamaha"));
		depo4.vehicle.add(new Vehicle("FZ         ",  "MP12AD",60, "Yamaha"));
		depo4.vehicle.add(new Vehicle("FZ-S       ",  "MP12AE", 65, "Yamaha"));

		
		System.out.println();
		System.out.println();
		System.out.println("----------List after fourth depo added---------");
		System.out.println();
		System.out.println();
		
		
		merge(scheduler,depo4.vehicle);
		show(scheduler);

		
		
		
	}
	

	
	
}
