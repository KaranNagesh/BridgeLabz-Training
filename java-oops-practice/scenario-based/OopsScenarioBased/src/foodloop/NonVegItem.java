
package foodloop;

//Inheriting properties of FoodItem
public class NonVegItem extends FoodItem {

	//Parameterized Constructor
    public NonVegItem(String name, double price, int stock) {
        super(name, "Non Veg", price, stock);
    }

    //Overriding abstract method 
    @Override
    public double applyDiscount() {
        // 10% discount on Non veg items
        return price * 0.15;
    }
}
