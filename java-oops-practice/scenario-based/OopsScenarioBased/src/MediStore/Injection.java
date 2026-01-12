package MediStore;
import java.time.LocalDate;

public class Injection extends Medicine {

	Injection(String name, double price, LocalDate expiryDate) {
		super(name, price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	// different checkexpiry() function for liquids
	@Override
	public void checkExpiry() {
		LocalDate currentDate = LocalDate.now();
		 if (this.expiryDate.minusDays(10).isBefore(currentDate)) {
	            System.out.println("The item has expired.");
	        } else if (this.expiryDate.minusDays(10).isEqual(currentDate)) {
	            System.out.println("The item expires today.");
	        } else {
	            System.out.println("The item is not expired yet.");      
	}
	
	}
}
