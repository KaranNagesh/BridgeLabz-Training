package SwiftCart;

public class Main {

	 public static void main(String[] args) {

	     // Create products
	     Product milk = new PerishableProduct("Milk", 50);
	     Product apple = new PerishableProduct("Apple", 30);
	     Product rice = new NonPerishableProduct("Rice", 60);

	     // Create cart
	     Cart cart = new Cart();

	     // Add products with quantity
	     cart.addProduct(milk, 2);   // 50 * 2
	     cart.addProduct(apple, 3);  // 30 * 3
	     cart.addProduct(rice, 1);   // 60 * 1

	     // Generate bill
	     cart.generateBill();
	 }
}
