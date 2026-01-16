
package foodloop;

//importing list from java.util
import java.util.List;

//Class Order implementing interface IOrderable
public class Order implements IOrderable {

	//Private instance of class
    private List<FoodItem> items; //List to store food items
    private double total;

    // Constructor for custom combo meals
    public Order(List<FoodItem> items) {
        this.items = items;
        calculateTotal();
    }

    //Method to calculate total bill
    private void calculateTotal() {
        double sum = 0;
        double discount = 0;

        for (FoodItem item : items) {
            sum += item.getPrice();
            discount += item.applyDiscount();
        }

        // operator logic: total = sum - discount
        total = sum - discount;
    }

    //Overriding method to place order
    @Override
    public void placeOrder() {
        System.out.println("Order placed successfully!");
        System.out.println("Total Amount: ₹" + total);
    }

    //Overriding method to cancel order
    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }
}
