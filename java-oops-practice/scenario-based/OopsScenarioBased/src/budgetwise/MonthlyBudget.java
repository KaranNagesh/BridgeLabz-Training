
package budgetwise;

import java.util.Map;

//Monthly budget implementation
class MonthlyBudget extends Budget {

	MonthlyBudget(double income, double limit, Map<String, Double> categoryLimits) {
		super(income, limit, categoryLimits);
	}

	// Monthly report format
	public void generateReport() {
		System.out.println("----- Monthly Budget Report -----");
		System.out.println("Income: " + income);
		System.out.println("Expenses: " + totalExpenses());
		System.out.println("Net Savings: " + netSavings());
	}

	// Detect overspending monthly
	public void detectOverspend() {
		if (totalExpenses() > limit) {
			System.out.println("Monthly budget limit exceeded!");
		} else {
			System.out.println("Monthly spending within limit");
		}
	}
}
