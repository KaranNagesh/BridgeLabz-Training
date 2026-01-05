package cabbygo;


public class Main {
	 public static void main(String[] args) {

	        Vehicle v1 = new Mini("MH12AB1234");
	        Vehicle v2 = new Sedan("DL09XY5678");
	        Vehicle v3 = new Suv("GJ01ZZ9999");

	        System.out.println("---------------------");
	        v1.bookRide(10);   // Mini rate
	        System.out.println("---------------------");
	        v2.bookRide(10);   // Sedan rate
	        System.out.println("---------------------");
	        v3.bookRide(10);   // SUV rate

	        System.out.println("---------------------");
	        v1.endRide();
	    }

}