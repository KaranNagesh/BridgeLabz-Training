package mybank;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Account a1 = new CurrentAccount(14555, 0);
		Account a2 = new SavingsAccount(25500, 6000);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do You want to see Current Account or Saving Account");
		System.out.println("1 => Current Account");
		System.out.println("2 => Saving Account");
		int option  = input.nextInt();
		
		switch(option) {
		case 1 -> {
			System.out.println();
			System.out.println("---------------Current Account Details--------------------");
			a1.calculateInterest();
			System.out.println();
			a1.checkBalance();
			
			System.out.println("Choose : ");
			System.out.println("3 => Deposit Amount");
			System.out.println("4 => Withdrawal Amount");
			System.out.println("5 => exit");
			int option2 = input.nextInt();
			
			
			switch(option2) {
			
			case 3 -> {
				System.out.println("--------------------------------------");
				System.out.println("Enter the amount to be deposited");
				double amount = input.nextDouble();
				a1.deposit(amount);
			}
			case 4 -> {
				System.out.println("--------------------------------------");
				System.out.println("Enter the amount to be withdrawal");
				double amount = input.nextDouble();
				a1.withdraw(amount);
			}
			case 5 -> {
				System.out.println("--------------------------------------");
				System.out.println("You have successfully exited");
			}
			default -> System.out.println("Invalid option");
			
			}
			
			
		} 
		case 2 -> {
			System.out.println("----------------Savings Account Details-------------------");
			a2.calculateInterest();
			System.out.println();
			a2.checkBalance();
			
			System.out.println("Choose : ");
			System.out.println("3 => Deposit Amount");
			System.out.println("4 => Withdrawal Amount");
			System.out.println("5 => exit");
			int option2 = input.nextInt();
			
			
			switch(option2) {
			
			case 3 -> {
				System.out.println("--------------------------------------");
				System.out.println("Enter the amount to be deposited");
				double amount = input.nextDouble();
				a2.deposit(amount);
			}
			case 4 -> {
				System.out.println("--------------------------------------");
				System.out.println("Enter the amount to be withdrawal");
				double amount = input.nextDouble();
				a2.withdraw(amount);
			}
			case 5 -> {
				System.out.println("--------------------------------------");
				System.out.println("You have successfully exited");
			}
			default -> System.out.println("Invalid option");
			
			}
			
		}
		
		
		
		}	
		
	}
}
