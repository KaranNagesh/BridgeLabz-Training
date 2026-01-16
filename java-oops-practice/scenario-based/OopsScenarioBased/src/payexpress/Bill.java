
package payexpress;

//Abstract class representing a generic bill
abstract class Bill implements IPayable {

	// Bill type (Electricity, Water, Internet)
	private String type;

	// Bill amount
	private double amount;

	// Due date of the bill
	private String dueDate;

	// Payment status (encapsulated)
	private boolean isPaid;

	// Constructor used to create recurring bills
	public Bill(String type, double amount, String dueDate) {
		this.type = type; // Initialize bill type
		this.amount = amount; // Initialize amount
		this.dueDate = dueDate; // Initialize due date
		this.isPaid = false; // Bill is unpaid initially
	}

	// Protected method to calculate late fee
	protected double calculateLateFee(double penalty) {
		return amount + penalty; // Operator usage to add penalty
	}

	// Method to pay the bill
	@Override
	public void pay() {
		if (!isPaid) { // Check if bill is unpaid
			isPaid = true; // Update payment status
			System.out.println(type + " bill paid successfully.");
		} else {
			System.out.println(type + " bill is already paid.");
		}
	}

	// Getter for bill type
	public String getType() {
		return type;
	}

	// Getter for bill amount
	public double getAmount() {
		return amount;
	}

	// Getter for due date
	public String getDueDate() {
		return dueDate;
	}

	// Getter for payment status
	public boolean isPaid() {
		return isPaid;
	}
}
