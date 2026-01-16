
package employeeaccount;
 
public class BankApp {
    public static void main(String[] args) {

        // Creating Savings Account
        SavingsAccount savings = new SavingsAccount(101, 5000, 5);

        // Assign account to customer
        Customer customer1 = new Customer("Karan", savings);

        customer1.showBalance();
        customer1.performDeposit(2000);
        customer1.performWithdraw(1000);
        savings.addInterest();
        customer1.showBalance();

        System.out.println("-------------------");

        // Creating Current Account
        CurrentAccount current = new CurrentAccount(102, 10000);
        Customer customer2 = new Customer("Rahul", current);

        customer2.showBalance();
        customer2.performWithdraw(3000);
        customer2.showBalance();
    }
}
