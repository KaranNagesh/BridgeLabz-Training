import java.util.Scanner;

class UniversityFeeDiscount{
	
	public static void main(String[] args){
		
	// Creating Scanner object to read input values
	Scanner sc = new Scanner(System.in);
	
	// Getting the original university fee from the user
	double fee = sc.nextInt();
	
	// Reading the discount percentage
	double discountPercent = sc.nextInt();
	
	// Calculating the discount amount
	double discount = (fee * discountPercent) / 100;
	
	// Calculating the final fee after discount
	double discountedFee = fee - discount;
	
	// Displaying the discount and final payable fee
	System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
	
}