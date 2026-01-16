
package payexpress;

//Internet bill class inheriting Bill
class InternetBill extends Bill {

	// Constructor for internet bill
	public InternetBill(double amount, String dueDate) {
		super("Internet", amount, dueDate); // Call parent constructor
	}

	// Polymorphic reminder implementation
	@Override
	public void sendReminder() {
		System.out.println("Internet Bill Reminder: Stay connected by paying on time.");
	}
}
