import java.util.Scanner;
public class TotalPrice{
	
public static void main(String[] args){
	//Creating Scanner object to read input values
	Scanner sc = new Scanner(System.in);
	
	//Getting the unit price from the user
	double unitPrice = sc.nextDouble();
	
	//Getting the quantity from the user
	double quantity = sc.nextDouble();
	
	//Calculating the total purchase price
	double totalPurchasePrice = unitPrice * quantity;
	
	//Displaying the total purchase price on used based unitPrice and quantity
	System.out.println("The total purchase is INR " + totalPurchasePrice + " if the quanitity " + quantity + " and unit price is INR " + unitPrice);
}

}