
package payexpress;

//Water bill class inheriting Bill
class WaterBill extends Bill {

	// Constructor for water bill
	public WaterBill(double amount, String dueDate) {
		super("Water", amount, dueDate); // Call parent constructor
	}

	// Polymorphic reminder implementation
	@Override
	public void sendReminder() {
		System.out.println("Water Bill Reminder: Pay to ensure uninterrupted water supply.");
	}
}
