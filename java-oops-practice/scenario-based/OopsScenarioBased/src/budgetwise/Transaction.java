
package budgetwise;

import java.time.LocalDate;

//Transaction class
class Transaction {
	private double amount; // Encapsulated
	private String type; // Income or Expense
	private LocalDate date;
	private String category;

	// Constructor
	Transaction(double amount, String type, String category) {
		this.amount = amount;
		this.type = type;
		this.category = category;
		this.date = LocalDate.now();
	}

	// Getters only (no setters → restricted editing)
	double getAmount() {
		return amount;
	}

	String getType() {
		return type;
	}

	String getCategory() {
		return category;
	}
}
