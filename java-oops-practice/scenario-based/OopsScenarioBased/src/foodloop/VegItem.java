
package foodloop;

//Inheriting properties of FoodItem class
public class VegItem extends FoodItem {

	//Parameterized Constructor
    public VegItem(String name, double price, int stock) {
        super(name, "Veg", price, stock);
    }
    
    //Overriding abstract method
    @Override
    public double applyDiscount() {
        // 10% discount on veg items
        return price * 0.10;
    }
}
