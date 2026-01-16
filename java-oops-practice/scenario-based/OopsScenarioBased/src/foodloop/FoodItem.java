
package foodloop;

//Super class
public abstract class FoodItem {

	//Private and protected instance of class
    private String name;
    private String category;
    private boolean available;
    private int stock;   // hidden (encapsulation)
    protected double price;

    //Parameterized Constructor
    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.available = stock > 0;
    }

    //Getter method to get price
    public double getPrice() {
        return price;
    }

    // public method to check item availability
    public boolean isAvailable() {
        return available;
    }

    //Method to update stock
    protected void updateStock(int quantity) {
        stock -= quantity;
        if (stock <= 0) {
            available = false;
        }
    }

    //Abstract method to apply discount
    public abstract double applyDiscount();

    //Getter method to get item name
    public String getName() {
        return name;
    }
}
