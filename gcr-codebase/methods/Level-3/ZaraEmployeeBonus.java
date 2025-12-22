public class ZaraEmployeeBonus {

    // Method to generate salary and years of service
    // salary → 5 digit random number
    // years of service → random between 1 and 10
    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            // Generate 5-digit salary (10000 to 99999)
            data[i][0] = (int) (Math.random() * 90000) + 10000;

            // Generate years of service (1 to 10)
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    // Column 0 → New Salary
    // Column 1 → Bonus Amount
    public static double[][] calculateBonusAndNewSalary(double[][] oldData) {

        double[][] newData = new double[oldData.length][2];

        for (int i = 0; i < oldData.length; i++) {

            double salary = oldData[i][0];
            double years = oldData[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;   // 5% bonus
            } else {
                bonus = salary * 0.02;   // 2% bonus
            }

            newData[i][0] = salary + bonus; // New Salary
            newData[i][1] = bonus;          // Bonus
        }
        return newData;
    }

    // Method to calculate totals and display in tabular format
    public static void displaySummary(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");

        for (int i = 0; i < oldData.length; i++) {

            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf(
                "%d\t%.0f\t\t%.0f\t%.2f\t%.2f%n",
                (i + 1), oldSalary, years, bonus, newSalary
            );
        }

        System.out.printf("Total Old Salary : %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Paid : %.2f%n", totalBonus);
        System.out.printf("Total New Salary : %.2f%n", totalNewSalary);
    }

    
    public static void main(String[] args) {

        int employees = 10;

        double[][] oldSalaryAndService = generateEmployeeData(employees);
        double[][] newSalaryAndBonus = calculateBonusAndNewSalary(oldSalaryAndService);

        displaySummary(oldSalaryAndService, newSalaryAndBonus);
    }
}
