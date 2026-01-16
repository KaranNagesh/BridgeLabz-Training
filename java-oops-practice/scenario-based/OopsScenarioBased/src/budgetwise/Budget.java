
package budgetwise;

import java.util.*;

//Abstract Budget class
abstract class Budget implements IAnalyzable {

	protected double income;
	protected double limit;
	protected Map<String, Double> categoryLimits;
	protected List<Transaction> transactions;

	// Constructor for custom categories
	Budget(double income, double limit, Map<String, Double> categoryLimits) {
		this.income = income;
		this.limit = limit;
		this.categoryLimits = categoryLimits;
		this.transactions = new ArrayList<>();
	}

	// Add transaction (controlled access)
	public void addTransaction(Transaction t) {
		transactions.add(t);
	}

	// Calculate total expenses
	protected double totalExpenses() {
		double total = 0;
		for (Transaction t : transactions) {
			if (t.getType().equalsIgnoreCase("Expense")) {
				total += t.getAmount();
			}
		}
		return total;
	}

	// Operator usage: income - expenses
	protected double netSavings() {
		return income - totalExpenses();
	}
}
