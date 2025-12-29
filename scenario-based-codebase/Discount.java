import java.util.Scanner;
public class Discount{
	public static void main(String[] args){
		
		
		//Displaying the discounts of the stores to the customers
		System.out.println("Discounts in the store");
		System.out.println("5% discount on the shopping of $500 and above");
		System.out.println("10% discount on the shopping of $1000 and above !!");
		System.out.println("20% discount on the shopping of $2500 and above !!");
		System.out.println("30% discount on the shopping of $5000 and above !!");
		System.out.println("40% discount on the shopping of $7500 and above !!");
		System.out.println("50% discount on the shopping of $10000 and above !!");
		
		Scanner sc = new Scanner(System.in);
		
		//Taking number of items 
		System.out.print("Enter number of items : " );
		int num = sc.nextInt();
		double price = 0;
		double totalPrice = 0;
		double discountedPrice = 0;
		
		
		//taking prices of all items and calculate sum of them
		for(int i = 0; i < num; i++){
			System.out.println();
			System.out.print("Enter price of item " + (i+1) + " : " );
			price = sc.nextInt();
			totalPrice += price;
		}
		
		
		
		//Using else-if giving discount to the customer
		if(totalPrice >= 500 && totalPrice < 1000){
			discountedPrice = totalPrice - ((totalPrice * 5) / 100);
			System.out.println("Your total price is of $" + totalPrice + " and you got the discount of 5% your discounted Price will be $" + discountedPrice);
		} else if(totalPrice >=1000 && totalPrice < 2500){
			discountedPrice = totalPrice - ((totalPrice * 10) / 100);
			System.out.println("Your total price is of $" + totalPrice + " and you got the discount of 10% your discounted Price will be $" + discountedPrice);
			
		} else if(totalPrice >=2500 && totalPrice < 5000){
			discountedPrice = totalPrice - ((totalPrice * 20) / 100);
			System.out.println("Your total price is of $" + totalPrice + " and you got the discount of 20% your discounted Price will be $" + discountedPrice);

		} else if(totalPrice >=5000 && totalPrice < 7500){
			discountedPrice = totalPrice - ((totalPrice * 30 ) / 100);
			System.out.println("Your total price is of $" + totalPrice + " and you got the discount of 30% your discounted Price will be $" + discountedPrice);

		} else if(totalPrice >=7500 && totalPrice < 10000){
			discountedPrice = totalPrice - ((totalPrice * 40) / 100);
			System.out.println("Your total price is of $" + totalPrice + " and you got the discount of 40% your discounted Price will be $" + discountedPrice);

		} else if(totalPrice >= 10000){
			discountedPrice = totalPrice - ((totalPrice * 50) / 100);
			System.out.println("Your total price is of $" + totalPrice + " and you got the discount of 50% your discounted Price will be $" + discountedPrice);

		} else {
			System.out.println("Discount is not available on that total price , total Price : $" + totalPrice );
			System.out.println("Sorry for  the inconvenience");
		}
	}
}