
// Customer has an Account (Association)
package employeeaccount;
public class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void performDeposit(double amount) {
        account.deposit(amount);
    }

    public void performWithdraw(double amount) {
        account.withdraw(amount);
    }

    public void showBalance() {
        System.out.print(name + " ");
        account.displayBalance();
    }
}
