//  Raj’s Result Generator

import java.util.Scanner;

public class RajResultGenerator {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int total = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter marks for subject " + i + ":");
			int marks = sc.nextInt();
			total += marks;
		}

		double average = total / 5.0;
		System.out.println("Average marks: " + average);

		switch ((int) average / 10) {

			case 9:
			case 8:
				System.out.println("Grade: A");
				break;

			case 7:
				System.out.println("Grade: B");
				break;

			case 6:
				System.out.println("Grade: C");
				break;

			case 5:
				System.out.println("Grade: D");
				break;

			default:
				System.out.println("Grade: F");
		}

		sc.close();
	}
}
