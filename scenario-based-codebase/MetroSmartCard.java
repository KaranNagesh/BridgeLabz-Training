//  Metro Smart Card Fare Deduction 

import java.util.Scanner;

public class MetroSmartCard {

	public static void main(String args[]) {

		// Scanner object
		Scanner sc = new Scanner(System.in);
		// Current balance 
		double balance = 200.0;

		while (balance > 0) {

			System.out.println("Current balance: " + balance);
			System.out.println("Enter 0 for Exit \nEnter distance in km:");

			// distance 
			int distance = sc.nextInt();

			if (distance == 0) {
				System.out.println("Thank you for using Metro.");
				break;
			}

			double fare = (distance <= 5) ? 10 : (distance <= 15) ? 20 : 30;

			if (fare <= balance) {
				balance -= fare;
				System.out.println("Fare deducted: " + fare);
			}
			else {
				System.out.println("Insufficient balance.");
				break;
			}
		}

		sc.close();
	}
}
