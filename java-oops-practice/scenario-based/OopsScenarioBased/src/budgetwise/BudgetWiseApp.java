
package budgetwise;

import java.util.*;

//Main class
public class BudgetWiseApp {

	public static void main(String[] args) {

		// Category limits
		Map<String, Double> categories = new HashMap<>();
		categories.put("Food", 5000.0);
		categories.put("Rent", 10000.0);
		categories.put("Travel", 3000.0);

		// Polymorphism
		Budget monthly = new MonthlyBudget(30000, 20000, categories);
		Budget annual = new AnnualBudget(360000, 240000, categories);

		// Add transactions
		monthly.addTransaction(new Transaction(4000, "Expense", "Food"));
		monthly.addTransaction(new Transaction(12000, "Expense", "Rent"));
		monthly.addTransaction(new Transaction(2000, "Expense", "Travel"));

		// Generate reports
		monthly.generateReport();
		monthly.detectOverspend();

		// Annual report
		annual.addTransaction(new Transaction(150000, "Expense", "Rent"));
		annual.addTransaction(new Transaction(50000, "Expense", "Travel"));

		annual.generateReport();
		annual.detectOverspend();
	}
}
