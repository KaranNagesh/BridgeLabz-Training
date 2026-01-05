package hospitalpatientmanagementsystem;

public class Main {
	public static void main(String[] args) {
		
		Doctor d1 = new Doctor("vishu jain" ,1,"Gaestroentrolist",18);
		d1.displayInfo();
		
		
		System.out.println();
		Patient p1 = new InPatient("rohan" , 42,1, "02/02/1985");
		Patient p2 = new OutPatient("rohan" , 42,1, 7);
		
		
		p1.displayInfo();
		System.out.println();
		p2.displayInfo();
		
		
		Bill b1 = new Bill(1200 , 4500);
		double totalBill = b1.calculatePayment();
		System.out.println("Total bill b1 is : " + totalBill);

		
	}
	
}
