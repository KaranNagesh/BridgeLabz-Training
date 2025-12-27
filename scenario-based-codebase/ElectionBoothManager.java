// Election Booth Manager ️

import java.util.Scanner;

public class ElectionBoothManager {

	public static void main(String args[]) {

		//scanner object
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("if exit press -1 or  \n Enter voter age:");
			int age = sc.nextInt();

			if (age == -1) {
				System.out.println("Voting process ended.");
				break;
			}

			if (age >= 18) {
				System.out.println("Eligible to vote.");
				System.out.println("Enter your vote (1, 2, or 3):");
				int vote = sc.nextInt();

				if (vote == 1 || vote == 2 || vote == 3) {
					System.out.println("Vote recorded successfully.");
				}
				else {
					System.out.println("Invalid vote.");
				}
			}
			else {
				System.out.println("Not eligible to vote.");
			}
		}

		sc.close();
	}
}
