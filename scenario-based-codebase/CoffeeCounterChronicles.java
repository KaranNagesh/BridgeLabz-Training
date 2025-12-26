import java.util.Scanner;

public class CoffeeCounterChronicles {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String wantCoffee = "yes";

		while (!wantCoffee.equals("exit")) {

			System.out.println("Enter 1 for Coffee Type 1");
			System.out.println("Enter 2 for Coffee Type 2");
			System.out.println("Enter 3 for Coffee Type 3");
			System.out.println("Enter 4 for Coffee Type 4");
			System.out.println("Enter 5 for exit");

			int coffeeType = sc.nextInt();

			if (coffeeType == 5) {
				System.out.println("Thank you! Visit again.");
				break;
			}

			int priceOfOne = 0;

			switch (coffeeType) {

				case 1: {
					System.out.println("Coffee type 1 selected");
					priceOfOne = 200;
					break;
				}

				case 2: {
					System.out.println("Coffee type 2 selected");
					priceOfOne = 300;
					break;
				}

				case 3: {
					System.out.println("Coffee type 3 selected");
					priceOfOne = 250;
					break;
				}

				case 4: {
					System.out.println("Coffee type 4 selected");
					priceOfOne = 200;
					break;
				}

				default: {
					System.out.println("Coffee uplabdh nhi h");
					continue;
				}
			}

			System.out.println("Enter number of quantity:");
			int quantities = sc.nextInt();

			int totalAmount = priceOfOne * quantities;
			double gst = totalAmount * 0.18;
			double finalBill = totalAmount + gst;

			System.out.println("Total Amount : " + totalAmount);
			System.out.println("GST (18%) : " + gst);
			System.out.println("Final Bill Amount : " + finalBill);

			System.out.println("Type 'exit' to stop or 'yes' to continue:");
			wantCoffee = sc.next();
		}

		sc.close();
	}
}
