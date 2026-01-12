package MediStore;
import java.time.LocalDate;
public class Medicine implements ISellable {
	protected String name;
	private double price;
	private int quantity = 10;
	protected LocalDate expiryDate;

	
	Medicine(String name, double price,LocalDate expiryDate){
		this.name = name;
		this.setPrice(price);
		this.expiryDate = expiryDate;
	}


	


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}





	@Override
	public void sell(int quantityWant) {
		int quantity = this.quantity;
		if(quantity - quantityWant < 0){
			System.out.println("Not has a sufficient stock to make a sell");
		} else {
			quantity -= quantityWant;
			double totalPrice = this.price * quantityWant;
			if(totalPrice < 200) {
				totalPrice = totalPrice - (0.05 * totalPrice);
				System.out.println("Your total bill is of rs." + totalPrice + " after 5% discount ");

			} else if (totalPrice < 500) {
				totalPrice = totalPrice - (0.10 * totalPrice);
				System.out.println("Your total bill is of rs." + totalPrice + " after 10% discount ");

			} else if (totalPrice < 1000) {
				totalPrice = totalPrice - (0.20 * totalPrice);
				System.out.println("Your total bill is of rs." + totalPrice + " after 20% discount ");

			} else if (totalPrice < 2000) {
				totalPrice = totalPrice - (0.35 * totalPrice);
				System.out.println("Your total bill is of rs." + totalPrice + " after 35% discount ");

			} else {
				totalPrice = totalPrice - (0.50 * totalPrice);
				System.out.println("Your total bill is of rs." + totalPrice + " after 50% discount ");
			}
		}
	}





	
	
	@Override
	public void checkExpiry() {
		LocalDate currentDate = LocalDate.now();
		 if (this.expiryDate.isBefore(currentDate)) {
	            System.out.println("The item has expired.");
	        } else if (this.expiryDate.isEqual(currentDate)) {
	            System.out.println("The item expires today.");
	        } else {
	            System.out.println("The item is not expired yet.");
	        }
	}





	public double getPrice() {
		return price;
	}





	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

