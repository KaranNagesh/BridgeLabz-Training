
package budgetwise;

import java.util.Map;

//Annual budget implementation
class AnnualBudget extends Budget {

	AnnualBudget(double income, double limit, Map<String, Double> categoryLimits) {
		super(income, limit, categoryLimits);
	}

	// Yearly report format (polymorphism)
	public void generateReport() {
		System.out.println("===== Annual Budget Summary =====");
		System.out.println("Annual Income: " + income);
		System.out.println("Annual Expenses: " + totalExpenses());
		System.out.println("Annual Savings: " + netSavings());
	}

	// Detect overspending yearly
	public void detectOverspend() {
		if (totalExpenses() > limit) {
			System.out.println("Annual budget exceeded!");
		} else {
			System.out.println("Annual spending under control");
		}
	}
}
