
package foodloop;

//Importing list and arraylist from java.util package
import java.util.ArrayList;
import java.util.List;

//Main class
public class FoodLoopApp {

    public static void main(String[] args) {

    	//creating object of veg and non-veg items
        FoodItem item1 = new VegItem("Paneer Burger", 120, 10);
        FoodItem item2 = new NonVegItem("Chicken Pizza", 250, 5);
        FoodItem item3 = new VegItem("French Fries", 80, 15);

        //Creating a list to store object of of foodItems
        List<FoodItem> comboMeal = new ArrayList<>();
        comboMeal.add(item1);
        comboMeal.add(item2);
        comboMeal.add(item3);
        
        //Creating object of Order to order combo meal
        Order order = new Order(comboMeal);
        order.placeOrder(); //Placing order
    }
}
