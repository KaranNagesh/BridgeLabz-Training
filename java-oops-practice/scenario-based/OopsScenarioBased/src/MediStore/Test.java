package MediStore;

import java.time.LocalDate;

public class Test {
	public static void main(String args[]) {
		Medicine m1 = new Tablet("paracetamol", 100, LocalDate.of(2026,5,15));
		 
		m1.checkExpiry();
		
		m1.sell(2);
		
		Medicine m2 = new Syrup("Torex" , 85,LocalDate.of(2024,5,15));
		m2.checkExpiry();
		
		Medicine m3 = new Injection("titness", 15,LocalDate.of(2027,3, 5));
		m3.sell(12);
		
		
	}
}
