import java.util.Scanner;

public class EmployeeBonusZara {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Total number of employees
        int n = 10;

        // Arrays to store salary and years of service
        double[] salary = new double[n];
        double[] yearsOfService = new double[n];

        // Arrays to store bonus amount and new salary
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        // Variables to store totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

     
        // Input loop for 10 employees
        for (int i = 0; i < n; i++) {

            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();

            // Validation: salary and years must be positive
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // decrement index to repeat this employee
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }


        // Calculation loop for bonus & salaries
        for (int i = 0; i < n; i++) {

            // Add old salary to total
            totalOldSalary += salary[i];

            // Bonus calculation based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Add totals
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }


        // Printing final results
        System.out.println("Total Old Salary of all employees: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary of all employees: " + totalNewSalary);

     
    }
}
