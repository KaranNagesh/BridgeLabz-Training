package payexpress;

public class Main {
	// Main method (program entry point)
	public static void main(String[] args) {

		// Creating different bill objects using polymorphism
		Bill bill1 = new ElectricityBill(1200, "15-Jan-2026");
		Bill bill2 = new WaterBill(450, "18-Jan-2026");
		Bill bill3 = new InternetBill(999, "20-Jan-2026");

		// Sending reminders for all bills
		bill1.sendReminder();
		bill2.sendReminder();
		bill3.sendReminder();

		System.out.println(); // Line break

		// Paying all bills
		bill1.pay();
		bill2.pay();
		bill3.pay();

		System.out.println(); // Line break

		// Calculating late fee using operator
		double lateAmount = bill1.calculateLateFee(100);

		// Displaying late fee amount
		System.out.println("Electricity bill with late fee: ₹" + lateAmount);
	}
}
