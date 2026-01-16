
package payexpress;

//Electricity bill class inheriting Bill
class ElectricityBill extends Bill {

	// Constructor for electricity bill
	public ElectricityBill(double amount, String dueDate) {
		super("Electricity", amount, dueDate); // Call parent constructor
	}

	// Polymorphic reminder implementation
	@Override
	public void sendReminder() {
		System.out.println("Electricity Bill Reminder: Avoid power disconnection!");
	}
}
